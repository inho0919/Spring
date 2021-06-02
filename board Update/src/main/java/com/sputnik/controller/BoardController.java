package com.sputnik.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sputnik.dao.BoardDAO;
import com.sputnik.domain.BoardVO;
import com.sputnik.service.BoardService;



@Controller
@RequestMapping("/sputnik/*")
public class BoardController {

 @Inject
 private BoardService service;

 @RequestMapping(value = "/list", method = RequestMethod.GET)
 public void getList(Model model) throws Exception {
  
  List list = null;
  list = service.list();
  model.addAttribute("list", list);
 }
 
 @RequestMapping(value= "/write", method=RequestMethod.GET)
 public void getWrite() throws Exception
 {
	 
 }
 
 @RequestMapping(value="/write", method=RequestMethod.POST)
 public String postwrite(BoardVO vo) throws Exception
 {
	 service.write(vo);
	 return "redirect:/sputnik/list";
 }
 
 @RequestMapping(value="/view", method=RequestMethod.GET)
 public void getView(@RequestParam("bno") int bno, Model model) throws Exception
 {
	BoardVO vo = service.view(bno);
	model.addAttribute("view", vo);
 }
 
 @RequestMapping(value="/update", method = RequestMethod.GET)
 public void getUpdate(@RequestParam("bno") int bno, Model model) throws Exception
 {
	 BoardVO vo = service.view(bno);
	 model.addAttribute("view", vo);
 }
 
 @RequestMapping(value="/update", method = RequestMethod.POST)
 public String postUpdate(BoardVO vo) throws Exception
 {
	 service.update(vo);
	 return "redirect:/sputnik/view?bno=" + vo.getBno();
 }
}
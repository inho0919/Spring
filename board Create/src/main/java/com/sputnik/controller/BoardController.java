package com.sputnik.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
}
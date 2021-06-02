package com.sputnik.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.sputnik.dao.BoardDAO;
import com.sputnik.domain.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

 @Inject
 private BoardDAO dao;
 
 @Override
 public List list() throws Exception {

  return dao.list();
 }
 
 @Override
 public void write(BoardVO vo) throws Exception
 {
	 dao.write(vo);
 }
 
 @Override
 public BoardVO view(int bno) throws Exception
 {
	 return dao.view(bno);
 }

 
 @Override
 public void update(BoardVO vo) throws Exception
 {
	 dao.update(vo);
 }
 
 public void delete(int bno) throws Exception
 {
	 dao.delete(bno);
 }
 
 
 @Override
 public int count() throws Exception
 {
	 return dao.count();
 }
 
 @Override
 public List listPage(int displayPost, int postNum) throws Exception
 {
	 return dao.listPage(displayPost, postNum);
 }
}
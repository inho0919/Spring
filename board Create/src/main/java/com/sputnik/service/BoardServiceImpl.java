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

}
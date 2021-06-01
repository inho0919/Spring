package com.sputnik.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.sputnik.dao.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {

 @Inject
 private BoardDAO dao;
 
 @Override
 public List list() throws Exception {

  return dao.list();
 }

}
package com.sputnik.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO {

 @Inject
 private SqlSession sql;
 
 private static String namespace = "com.sputnik.mappers.board";

 // 게시물 목록
 @Override
 public List list() throws Exception { 
  
  return sql.selectList(namespace + ".list");
 }

}
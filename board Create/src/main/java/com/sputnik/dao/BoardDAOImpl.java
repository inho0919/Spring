package com.sputnik.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sputnik.domain.BoardVO;

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

@Override
public void write(BoardVO vo) throws Exception {
	// TODO Auto-generated method stub
	sql.insert(namespace + ".write", vo);
}

}
package com.sputnik.dao;

import java.util.HashMap;
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

public BoardVO view(int bno) throws Exception
{
	return sql.selectOne(namespace + ".view", bno);
}

@Override
public void update(BoardVO vo) throws Exception
{
	sql.update(namespace + ".update", vo);
}

public void delete(int bno) throws Exception
{
	sql.delete(namespace + ".delete", bno);
}

@Override
public int count() throws Exception
{
	return sql.selectOne(namespace + ".count");
}

@Override
public List listPage(int displayPost, int postNum) throws Exception
{
	HashMap data = new HashMap();
	
	data.put("displayPost", displayPost);
	data.put("postNum", postNum);
	
	return sql.selectList(namespace + ".listPage", data);
}

}
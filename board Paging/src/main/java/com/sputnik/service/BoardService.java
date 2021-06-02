package com.sputnik.service;

import java.util.List;

import com.sputnik.domain.BoardVO;

public interface BoardService 
{
	public List list() throws Exception;
	
	public void write(BoardVO vo) throws Exception;
	
	public BoardVO view(int bno) throws Exception;
	
	public void update(BoardVO vo) throws Exception;
	
	public void delete(int bno) throws Exception;
	
	public int count() throws Exception;
	
	public List listPage(int displayPost, int postNum) throws Exception;
}

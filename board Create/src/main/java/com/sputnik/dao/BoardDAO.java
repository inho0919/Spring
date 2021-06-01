package com.sputnik.dao;

import java.util.List;

import com.sputnik.domain.BoardVO;

public interface BoardDAO 
{
	public List list() throws Exception;
	
	public void write(BoardVO vo) throws Exception;
}

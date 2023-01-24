package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BoardDao;
import com.example.demo.dto.BoardDto;

@Service("boardservice")
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDao dao;
	
	@Override
	public BoardDto getBoardBySeq(int seq) {
		return dao.getBoardBySeq(seq);
	}

}

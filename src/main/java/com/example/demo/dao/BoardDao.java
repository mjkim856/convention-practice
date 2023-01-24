package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.BoardDto;

@Mapper
@Repository
public interface BoardDao {

	public BoardDto getBoardBySeq(int seq);

}

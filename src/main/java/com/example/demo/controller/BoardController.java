package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.BoardDto;
import com.example.demo.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	@Qualifier("boardservice")
	BoardService service;

	@GetMapping("/detail")
	public String main() {
		return "board/detail";
	}
	
	@GetMapping("/board/detail")
	public String detail(@RequestParam(value="seq", required=true) int seq) {
		
		BoardDto dto = service.getBoardBySeq(seq);
		
		return dto.toString();
	}
	
	
}

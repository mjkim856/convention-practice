package com.example.demo.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class BoardDto {

	private int seq;
	private String title;
	private String content;
	private String writer;
	private Date insertDate;
	private Date updateDate;
//	private UserDto userDto;
	
	public BoardDto() {}
	
//	public UserDto getUserDto() {
//		return userDto;
//	}
//
//	public void setUserDto(UserDto userDto) {
//		this.userDto = userDto;
//	}

	public int getSeq() {
	return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "BoardDto [seq=" + seq + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", insertDate=" + insertDate + ", updateDate=" + updateDate;
	}

	
	
	
	
}

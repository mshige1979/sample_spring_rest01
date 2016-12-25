package com.example.dto;

public abstract class AbstractDtoRes {
	
	private String result;
	AbstractDtoRes(){
		this.setResult("0");
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}

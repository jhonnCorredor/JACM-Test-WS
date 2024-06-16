package com.session3.JACM_test_WS.Dto;

public class ApiResponseDto <T>{

	private Boolean status;
	private T data;
	private String message;
	
	public ApiResponseDto() {
	}

	public ApiResponseDto( String message,T data,Boolean status) {
		super();
		this.status = status;
		this.data = data;
		this.message = message;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}

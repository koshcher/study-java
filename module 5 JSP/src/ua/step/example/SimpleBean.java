package ua.step.example;

import java.io.Serializable;

public class SimpleBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String message = "Текст сообщения не задан";
	
	public SimpleBean() {
		
	}
	
	public SimpleBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return (message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

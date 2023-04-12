package ua.step.model;

public class MessageBean {
	private String message;
	private int value;

	public void setMessage(String message) {
		this.message = message;
	}

	public void setMessage(String message, int value) {
		this.value = value;
		this.message = message;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void getMessage() {
		System.out.printf("Your Message : %s value is %d%n", message, value);
	}
}

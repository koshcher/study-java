package ua.step.example.part0.mailer;

public class ImapMailSender implements MailSender{
	public void send(String message) {
		System.out.printf("IMAP: %s%n", message);
	}
}

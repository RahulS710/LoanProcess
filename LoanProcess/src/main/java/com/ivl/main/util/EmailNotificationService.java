package com.ivl.main.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.ivl.main.model.User;

@Service
public class EmailNotificationService {
	private JavaMailSender javaMailSender;
	@Autowired
	public EmailNotificationService(JavaMailSender javaMailSender) {
		
		this.javaMailSender=javaMailSender;
	}

	public void sendNotification(User user)throws MailException
	{
		System.out.println("mail send------------------------");
		SimpleMailMessage mail=new SimpleMailMessage();
		mail.setTo(user.getEmail());
		mail.setFrom("omkarfalke1995@gmail.com");
		mail.setSubject(" User Password Notification");
		mail.setText("Hello!"+user.getFirstName()+" UserName"+":"+user.getAdharNo()+":"+"Your Password"+" : "+user.getPassword());
		javaMailSender.send(mail);
	}
}

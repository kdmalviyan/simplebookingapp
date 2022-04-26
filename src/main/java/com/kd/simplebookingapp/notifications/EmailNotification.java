package com.kd.simplebookingapp.notifications;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailNotification implements Notification{

    private final JavaMailSender emailSender;
    public EmailNotification(final JavaMailSender emailSender) {
        this.emailSender = emailSender;
    }

    @Value("notification.from.email")
    private String fromEmail;

    @Override
    @Async
    public void notify(String to, String subject, String message) {
        SimpleMailMessage email = new SimpleMailMessage();
        email.setSubject(subject);
        email.setText(message);
        email.setTo(to);
        email.setFrom(fromEmail);
        emailSender.send(email);
    }
}

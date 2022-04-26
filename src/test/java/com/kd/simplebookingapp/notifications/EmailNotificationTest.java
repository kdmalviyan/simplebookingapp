package com.kd.simplebookingapp.notifications;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;

import javax.mail.internet.MimeMessage;

@SpringBootTest
public class EmailNotificationTest {
    private JavaMailSender emailSender = mock(JavaMailSender.class);
    private Notification emailNotification;

    @Test
    public void testSend() {
        emailNotification = new EmailNotification(emailSender);
        doNothing().when(emailSender).send(any(MimeMessage.class));
        emailNotification.notify("test@test.com", "Test Notification!", "Test message");
    }
}

package com.kd.simplebookingapp.notifications;

public interface Notification {
    void notify(String to, String subject, String message);
}

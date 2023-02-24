package com.example.obspringejercicios123;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    NotificationService notificationService;

    public UserService(NotificationService notificationService){
        this.notificationService = notificationService;
    }


    public String notificationService() {
        return notificationService.notificationService();
    }
}

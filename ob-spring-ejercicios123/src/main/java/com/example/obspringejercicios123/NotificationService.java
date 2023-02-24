package com.example.obspringejercicios123;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public NotificationService() {
        System.out.println("Inicializando NotificationService");
    }
    public String Saludando(){
        return "Hola";
    }


    public String notificationService() {
        return Saludando();
    }
}

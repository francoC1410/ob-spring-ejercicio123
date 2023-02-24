package com.example.obspringejercicios123;

import org.springframework.stereotype.Component;

@Component
public class Saludo {
    public Saludo() {
        System.out.println("Inicializando Saludo");
    }
    public String imprimirSaludo(){
        return "hola a todos";
    }
}

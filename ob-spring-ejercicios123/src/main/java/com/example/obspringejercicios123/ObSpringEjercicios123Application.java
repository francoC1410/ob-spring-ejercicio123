package com.example.obspringejercicios123;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ObSpringEjercicios123Application {

	public static void main(String[] args) {
		//Ejercicio 1
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Saludo saludo = (Saludo) context.getBean("saludo");
		String texto = saludo.imprimirSaludo();
		System.out.println(texto);

		//Ejercicio 2
		UserService userService = (UserService) context.getBean("userService");
		String nombre = userService.notificationService();
		System.out.println(nombre);

		//Ejercicio 3
		SpringApplication.run(ObSpringEjercicios123Application.class, args);
		CocheRepository repository = context.getBean(CocheRepository.class);
		Coche chevrolet = new Coche(null,"astra", "chevrolet", "gris", 2009);
		System.out.println(chevrolet);

	}
}
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class MyFancyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFancyApiApplication.class, args);
		String text= "Hallo von der Console";
		text= "Heute ist ein schöner Tag!";
		System.out.println(text);
		int zahl1=1;
		int zahl2=5;
		int ergebnis=zahl1+zahl2;
		System.out.println(ergebnis);

	}

}

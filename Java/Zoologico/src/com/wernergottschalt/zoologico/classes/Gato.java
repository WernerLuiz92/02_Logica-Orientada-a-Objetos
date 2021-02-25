package com.wernergottschalt.zoologico.classes;

public class Gato extends Animal {

	public Gato(String name, int age) {
		super(name, age, "Felina");
		
	}

	@Override
	public void makeNoise() {
		
		System.out.println("Miau");
		
	}
	
	

}

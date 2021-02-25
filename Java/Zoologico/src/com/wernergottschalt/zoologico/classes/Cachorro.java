package com.wernergottschalt.zoologico.classes;

public class Cachorro extends Animal {

	public Cachorro(String name, int age) {
		super(name, age, "Canina");
		
	}

	@Override
	public void makeNoise() {
		
		System.out.println("Au Au");
		
	}
	
}

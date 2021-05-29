package com.wernergottschalt.zoologico.classes;

public class Cat extends Animal {

	public Cat(String name, int age) {
		super(name, age, "Felina");
		
	}

	@Override
	public void makeNoise() {
		if (isAlive()) {
			System.out.println("Miau");			
		} else {
			System.out.println(" ... ");
		}
		
	}
	
}

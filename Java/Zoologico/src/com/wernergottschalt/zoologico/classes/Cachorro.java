package com.wernergottschalt.zoologico.classes;

public class Cachorro extends Animal {

	public Cachorro(String name, int age) {
		super(name, age, "Canina");
		
	}
	
	@Override
	public Boolean isAdult() {
		
		if (isAlive) {
			return age >= 2;
		} else {
			return false;
		}
		
	}

	@Override
	public void makeNoise() {
		if (isAlive()) {
			System.out.println("Au Au");			
		} else {
			System.out.println(" ... ");
		}
		
	}
	
}

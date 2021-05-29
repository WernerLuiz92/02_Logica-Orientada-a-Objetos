package com.wernergottschalt.zoologico.classes;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	
	private String name;
	private List<Animal> animals;
	
	public Zoo() {
		animals = new ArrayList<Animal>();
	}
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public void removeAnimal(int id) {
		animals.remove(id);
	}
	
	public void listAnimals() {
		System.out.println("Animais do Zoologico:");
		for (int i = 0; i < animals.size(); i ++) {
			Animal animal = animals.get(i);
			if (animal.isAlive()) {
				System.out.println("    - "+animal.getName());				
			} else {
				System.out.println("    - "+animal.getName()+" -  † R.I.P");
			}
		}
	}
	
	public String getNome() {
		return name;
	}
	public void setNome(String name) {
		this.name = name;
	}
	
	
}

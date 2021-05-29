package com.wernergottschalt.zoologico.classes;

import java.util.ArrayList;
import java.util.List;

public class Veterinary {

	private String name;
	private List<Animal> animals;
	
	public Veterinary() {
		animals = new ArrayList<Animal>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void attendAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public void stopAttendingAnimal(int id) {
		animals.remove(id);
	}
	
	public void listAnimalsAttended() {
		System.out.println("Animais atendidos:");
		for (int i = 0; i < animals.size(); i++) {
			System.out.println("    - "+animals.get(i).getName());
		}
	}
	
}

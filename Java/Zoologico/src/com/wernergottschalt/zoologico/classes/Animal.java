package com.wernergottschalt.zoologico.classes;

public abstract class Animal {

	private String name;
	private String species;
	private int age;
	private Boolean isAlive;
	
	public Animal(String name, int age, String species) {
		this.name = name;
		this.age = age;
		this.species = species;
		this.isAlive = true;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Boolean getIsAlive() {
		return isAlive;
	}

	public abstract void makeNoise();
	
	public Boolean isAdult() {
		
		return age >= 1;
	}
	
}

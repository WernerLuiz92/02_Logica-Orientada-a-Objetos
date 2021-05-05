package com.wernergottschalt.zoologico.classes;

public abstract class Animal implements Animalable
{

	private String name;
	private String species;
	protected int age;
	protected Boolean isAlive;
	
	public Animal(String name, int age, String species) 
	{
		this.name = name;
		this.age = age;
		this.species = species;
		this.isAlive = true;
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getSpecies() 
	{
		return species;
	}
	public void setSpecies(String species) 
	{
		this.species = species;
	}
	
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	
	public Boolean isAlive() 
	{
		return isAlive;
	}

	@Override
	public abstract void makeNoise();
	
	@Override
	public Boolean isAdult() 
	{
		
		if (isAlive) {
			return age >= 1;
		} else {
			return false;
		}
		
	}
	
	@Override
	public final void toDie( ) 
	{
		this.isAlive = false;
	}
	
}

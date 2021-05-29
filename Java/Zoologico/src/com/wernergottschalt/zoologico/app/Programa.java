package com.wernergottschalt.zoologico.app;

import com.wernergottschalt.zoologico.classes.*;

public class Programa {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.setNome("Animais do Werner");
		
		Veterinary vet = new Veterinary();
		vet.setName("Juliano");

		Animal dog1 = new Dog("Princesa", 1);
		zoo.addAnimal(dog1);
		vet.attendAnimal(dog1);
		
		Animal dog2 = new Dog("Beethoven", 12);
		zoo.addAnimal(dog2);
		
		Animal cat1 = new Cat("Missie", 6);
		zoo.addAnimal(cat1);
		vet.attendAnimal(cat1);
		
		Animal cat2 = new Cat("Fritz", 4);
		zoo.addAnimal(cat2);
		
		dog2.toDie();
		cat2.toDie();
		
		zoo.listAnimals();
		vet.listAnimalsAttended();
		
		
//		
//		System.out.println("Ola, seu animal e da especie " + cachorro1.getSpecies());
//		System.out.println("O nome do seu animal e " + cachorro1.getName());
//		System.out.println("A idade do seu animal e de " + cachorro1.getAge() + " anos");
//		if (cachorro1.isAdult()) {
//			System.out.println("Seu animal e considerado adulto");
//		} else {
//			System.out.println("Seu animal e considerado filhote");
//		}
//		
//		System.out.println("");
//		
//		System.out.println("Ola, seu animal e da especie " + gato.getSpecies());
//		System.out.println("O nome do seu animal e " + gato.getName());
//		System.out.println("A idade do seu animal e de " + gato.getAge() + " anos");
//		if (gato.isAdult()) {
//			System.out.println("Seu animal e considerado adulto");
//		} else {
//			System.out.println("Seu animal e considerado filhote");
//		}
//		
//		System.out.println("====================");
//		System.out.println("Barulho do cachorro1: ");
//		cachorro1.makeNoise();
//		System.out.println("====================");
//		System.out.println("Barulho do cachorro2: ");
//		cachorro2.makeNoise();
//		System.out.println("====================");
//		System.out.println("Barulho do gato: ");
//		gato.makeNoise();
		
	}

}

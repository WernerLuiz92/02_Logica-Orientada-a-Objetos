package com.wernergottschalt.zoologico.app;

import com.wernergottschalt.zoologico.classes.*;

public class Programa {

	public static void main(String[] args) {

		Animal cachorro1 = new Cachorro("Princesa", 1);
		Animal cachorro2 = new Cachorro("Beethoven", 12);
		Animal gato = new Gato("Missie", 6);
		cachorro2.toDie();
		
		System.out.println("Ola, seu animal e da especie " + cachorro1.getSpecies());
		System.out.println("O nome do seu animal e " + cachorro1.getName());
		System.out.println("A idade do seu animal e de " + cachorro1.getAge() + " anos");
		if (cachorro1.isAdult()) {
			System.out.println("Seu animal e considerado adulto");
		} else {
			System.out.println("Seu animal e considerado filhote");
		}
		
		System.out.println("");
		
		System.out.println("Ola, seu animal e da especie " + gato.getSpecies());
		System.out.println("O nome do seu animal e " + gato.getName());
		System.out.println("A idade do seu animal e de " + gato.getAge() + " anos");
		if (gato.isAdult()) {
			System.out.println("Seu animal e considerado adulto");
		} else {
			System.out.println("Seu animal e considerado filhote");
		}
		
		System.out.println("====================");
		System.out.println("Barulho do cachorro1: ");
		cachorro1.makeNoise();
		System.out.println("====================");
		System.out.println("Barulho do cachorro2: ");
		cachorro2.makeNoise();
		System.out.println("====================");
		System.out.println("Barulho do gato: ");
		gato.makeNoise();
		
	}

}

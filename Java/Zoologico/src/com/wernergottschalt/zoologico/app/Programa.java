package com.wernergottschalt.zoologico.app;

import com.wernergottschalt.zoologico.classes.*;

public class Programa {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro("Princesa", 1);
		Gato gato = new Gato("Missie", 6);
		Cachorro cachorro2 = new Cachorro("Beethoven", 12);
		cachorro2.toDie();
		
		System.out.println("Ola, seu animal e da especie " + cachorro.getSpecies());
		System.out.println("O nome do seu animal e " + cachorro.getName());
		System.out.println("A idade do seu animal e de " + cachorro.getAge() + " anos");
		if (cachorro.isAdult()) {
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
		System.out.println("Barulho do cachorro: ");
		cachorro.makeNoise();
		System.out.println("====================");
		System.out.println("Barulho do gato: ");
		gato.makeNoise();
		System.out.println("====================");
		System.out.println("Barulho do cachorro2: ");
		cachorro2.makeNoise();
		
	}

}

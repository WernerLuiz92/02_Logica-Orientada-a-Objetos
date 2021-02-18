package br.com.treinaweb.zoologico.app;

import br.com.treinaweb.zoologico.classes.*;

public class Programa {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro("Princesa", 4, "Canina");
		Gato gato = new Gato("Missie", 6, "Felina");
		
		System.out.println("Olá, seu animal é da espécie " + cachorro.getSpecies());
		System.out.println("O nome do seu animal é " + cachorro.getName());
		System.out.println("A idade do seu animal é de " + cachorro.getAge() + " anos");
		if (cachorro.isAdult()) {
			System.out.println("Seu animal é considerado adulto");
		} else {
			System.out.println("Seu animal é considerado filhote");
		}
		
		System.out.println("");
		
		System.out.println("Olá, seu animal é da espécie " + gato.getSpecies());
		System.out.println("O nome do seu animal é " + gato.getName());
		System.out.println("A idade do seu animal é de " + gato.getAge() + " anos");
		if (gato.isAdult()) {
			System.out.println("Seu animal é considerado adulto");
		} else {
			System.out.println("Seu animal é considerado filhote");
		}
		
		
	}

}
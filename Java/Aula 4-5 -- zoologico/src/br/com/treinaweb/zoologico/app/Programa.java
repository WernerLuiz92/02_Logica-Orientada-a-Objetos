package br.com.treinaweb.zoologico.app;

import br.com.treinaweb.zoologico.classes.*;

public class Programa {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro("Princesa", 4, "Canina");
		Gato gato = new Gato("Missie", 6, "Felina");
		
		System.out.println("Ol�, seu animal � da esp�cie " + cachorro.getSpecies());
		System.out.println("O nome do seu animal � " + cachorro.getName());
		System.out.println("A idade do seu animal � de " + cachorro.getAge() + " anos");
		if (cachorro.isAdult()) {
			System.out.println("Seu animal � considerado adulto");
		} else {
			System.out.println("Seu animal � considerado filhote");
		}
		
		System.out.println("");
		
		System.out.println("Ol�, seu animal � da esp�cie " + gato.getSpecies());
		System.out.println("O nome do seu animal � " + gato.getName());
		System.out.println("A idade do seu animal � de " + gato.getAge() + " anos");
		if (gato.isAdult()) {
			System.out.println("Seu animal � considerado adulto");
		} else {
			System.out.println("Seu animal � considerado filhote");
		}
		
		
	}

}
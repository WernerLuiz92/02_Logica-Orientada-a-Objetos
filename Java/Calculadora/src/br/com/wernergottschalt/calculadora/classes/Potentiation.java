package br.com.wernergottschalt.calculadora.classes;

public class Potentiation extends Calculate {

	public Potentiation(int number1, int number2) {
		
		super(number1, number2);
		
	}

	@Override
	protected int doCalculate() {
		
		return (int) Math.pow(super.number1, super.number2);
		
	}

}

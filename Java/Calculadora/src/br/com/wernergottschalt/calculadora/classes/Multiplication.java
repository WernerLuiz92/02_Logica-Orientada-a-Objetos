package br.com.wernergottschalt.calculadora.classes;

public class Multiplication extends Calculate {

	public Multiplication(int number1, int number2) {
		super(number1, number2);
	}

	@Override
	protected int doCalculate() {
		return super.number1 * super.number2;
	}

}

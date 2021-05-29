package br.com.wernergottschalt.calculadora.classes;

public class Addition extends Calculate{

	public Addition(int number1, int number2) {
		super(number1, number2);
	}

	@Override
	protected int doCalculate() {
		return super.number1 + super.number2;
	}

}

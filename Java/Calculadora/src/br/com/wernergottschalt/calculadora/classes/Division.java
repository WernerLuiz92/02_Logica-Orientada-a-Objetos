package br.com.wernergottschalt.calculadora.classes;

public class Division extends Calculate {

	public Division(int number1, int number2) {
		super(number1, number2);
	}
	
	@Override
	public Boolean validate() {
		return super.number1 >= 0 && super.number2 > 0;
	}

	@Override
	protected int doCalculate() {
		return super.number1 / super.number2;
	}

}

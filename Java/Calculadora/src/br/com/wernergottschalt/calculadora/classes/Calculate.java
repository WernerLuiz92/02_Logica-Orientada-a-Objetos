package br.com.wernergottschalt.calculadora.classes;

import br.com.wernergottschalt.calculadora.interfaces.MathCalculator;

public abstract class Calculate implements MathCalculator {

	protected int number1;
	protected int number2;
	
	public Calculate(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	@Override
	public Boolean validate() {
		return number1 >= 0 && number2 >= 0;
	}

	@Override
	public final int calculate() {
		if (validate()) {
			return doCalculate();
		} else {
			return -999;
		}
	}
	
	protected abstract int doCalculate();

}

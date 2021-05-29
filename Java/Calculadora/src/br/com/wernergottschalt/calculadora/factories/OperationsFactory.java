package br.com.wernergottschalt.calculadora.factories;

import br.com.wernergottschalt.calculadora.classes.Addition;
import br.com.wernergottschalt.calculadora.classes.Calculate;
import br.com.wernergottschalt.calculadora.classes.Division;
import br.com.wernergottschalt.calculadora.classes.Multiplication;
import br.com.wernergottschalt.calculadora.classes.Potentiation;
import br.com.wernergottschalt.calculadora.classes.Subtraction;

public class OperationsFactory {

	public Calculate createOperation(int number1, int number2, String operation) {
		
		if (operation.equals("+")) {
			
			return new Addition(number1, number2);
			
		} else if (operation.equals("-")) {
			
			return new Subtraction(number1, number2);
			
		} else if (operation.equals("*")) {
			
			return new Multiplication(number1, number2);
			
		} else if (operation.equals("/")) {
			
			return new Division(number1, number2);
			
		} else if (operation.equals("^")) {
			
			return new Potentiation(number1, number2);
			
		} else {
			
			return null;
			
		}
		
	}
	
}

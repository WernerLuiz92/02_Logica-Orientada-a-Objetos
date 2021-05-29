package br.com.wernergottschalt.calculadora.app;

import br.com.wernergottschalt.calculadora.factories.OperationsFactory;
import br.com.wernergottschalt.calculadora.interfaces.MathCalculator;

public class App {

	public static void main(String[] args) {
		String actualOperation = "^";
		int number1 = 2;
		int number2 = 4;
		OperationsFactory factory = new OperationsFactory();
		
		MathCalculator operation = factory.createOperation(number1, number2, actualOperation);
		
		if (operation != null) {
			
			int result = operation.calculate();
			
			if (result != -999) {
				
				System.out.println(number1 + " " + actualOperation + " " + number2 + " = " + result);
				
			} else {
				
				System.out.println("Valores Invalidos");
				
			}
			
		} else {
			
			System.out.println("Operacao Invalida");
			
		}
		
	}

}

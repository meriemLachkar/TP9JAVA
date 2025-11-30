package com.exemple.tp;

public class MainCalc {
	public static void main(String args[]) throws CalculatorException {

		Calculator c = new Calculator();

		try {
			System.out.println("10 / 2 : " + c.division(10, 2));
			//System.out.println("10 / 0 : " + c.division(10, 0));
			
			//System.out.println(c.sqrt(-3));

			// System.out.println("10 + 2 : " + c.addition(10, 2));

			// System.out.println("10 * 2 : " + c.multiplication(10, 2));

			// System.out.println("10 - 2 : " + c.soustraction(10, 2));

			//System.out.println("10 ^ 2 : " + c.pow(10, 2));

			System.out.println("0 ^ -2 : " + c.pow(0, -2));

		} catch (CalculatorException error) {
			System.err.println(error.getMessage());
		} finally {
			System.out.println("Fin du calcul !");
		}

	}
}
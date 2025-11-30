package com.exemple.tp;

public class Calculator {

	public double addition(double a, double b) {
		return a + b;
	}

	public double soustraction(double a, double b) {
		return a - b;
	}

	public double multiplication(double a, double b) {
		return a * b;
	}

	public double division(double a, double b) throws CalculatorException {
		if (b == 0) {
			throw new CalculatorException("Erreur de calcul : Division par zéro impossible ! ");
		}
		return a / b;
	}

	public double pow(double a, double b) {
		if (a == 0 && b < 0) {
			throw new ArithmeticException("Erreur de calcul : La base ne peut pas etre 0 si l'exposant est négatif !");
		}
		return Math.pow(a, b);
	}

	public double sqrt(double a) {
		if (a < 0) {
			throw new ArithmeticException("Erreur de calcul : Le racine ne peut pas etre négatif !");
		}
		return Math.sqrt(a);
	}
}

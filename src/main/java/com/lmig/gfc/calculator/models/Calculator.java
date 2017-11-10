package com.lmig.gfc.calculator.models;

public class Calculator {
	private double firstNumber;
	private double secondNumber;
	private char operator;

	public Calculator(double firstNumber, char operator, double secondNumber) {
		this.firstNumber = firstNumber;
		this.operator = operator;
		this.secondNumber = secondNumber;
	}

	public double getFirstNumber() {
		return firstNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}

	public char getOperator() {
		return operator;
	}

	public double totalNum() {
		if (operator == '+') {
			return (firstNumber + secondNumber);
		}
		if (operator == '-') {
			return (firstNumber - secondNumber);
		}
		if (operator == '*') {
			return (firstNumber * secondNumber);
		}
		if (operator == '/') {
			return (firstNumber / secondNumber);
		}
		if (operator == '^') {
			return Math.pow(firstNumber, secondNumber);
		}
		return 0;
	}
}
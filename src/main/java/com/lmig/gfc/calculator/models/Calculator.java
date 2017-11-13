package com.lmig.gfc.calculator.models;

import java.util.ArrayList;



public class Calculator {
	private Double firstNumber = 0.0;
	private Double secondNumber = 0.0;
	private String operator = "";
	boolean argumentsAreSupplied;

	private ArrayList<Calculator> inputList;

	public Calculator(Double firstNumber, String operator, Double secondNumber) {
		inputList = new ArrayList<Calculator>();
		
		argumentsAreSupplied = firstNumber != null && operator != null && secondNumber != null;
		if (argumentsAreSupplied) {
			this.firstNumber = firstNumber;
			this.operator = operator;
			this.secondNumber = secondNumber;
		}
	}

	public Double getFirstNumber() {
		return firstNumber;
	}

	public Double getSecondNumber() {
		return secondNumber;
	}

	public String getOperator() {
		return operator;
	}

	public Double totalNum() {
		if (argumentsAreSupplied) {
			if (operator.equals("+")) {
				return (firstNumber + secondNumber);
			}
			if (operator.equals("-")) {
				return (firstNumber - secondNumber);
			}
			if (operator.equals("*")) {
				return (firstNumber * secondNumber);
			}
			if (operator.equals("/")) {
				return (firstNumber / secondNumber);
			}
			if (operator.equals("^")) {
				return Math.pow(firstNumber, secondNumber);
			}
		}
		return 0.0;
	}

	public void addToList(Calculator calculator) {
		inputList.add(calculator);
	}

	public ArrayList<Calculator> getInputList() {
		return inputList;
	}

}

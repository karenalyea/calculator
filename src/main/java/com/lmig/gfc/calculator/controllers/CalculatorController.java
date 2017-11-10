package com.lmig.gfc.calculator.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lmig.gfc.calculator.models.Calculator;

@Controller
public class CalculatorController {

	private ArrayList<Calculator> inputList;

	public CalculatorController() {
		inputList = new ArrayList<Calculator>();
	}

	@RequestMapping("/")
	public String defaultPage() {
		return "calculator";
	}

	@RequestMapping("/total")
	public ModelAndView total(double firstNumber, char operator, double secondNumber) {
		Calculator calculator = new Calculator(firstNumber, operator, secondNumber);
		double answer = calculator.totalNum();

		int index = 0;

		inputList.add(index, calculator);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");
		mv.addObject("answer", answer);
		mv.addObject("inputList", inputList);
		mv.addObject("arbitraryImage",
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT9eL-elhhI_24O6kmcDxX9C4yI1ClkU8vHRZiXjj_nFSTLvFPW");
		return mv;
	}

}
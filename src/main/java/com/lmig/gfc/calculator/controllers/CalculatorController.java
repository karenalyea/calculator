package com.lmig.gfc.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lmig.gfc.calculator.models.Calculator;

@Controller
public class CalculatorController {

	@RequestMapping("/")
	public String defaultPage() {
		return "calculator";
	}

	@RequestMapping("/total")
	public ModelAndView total(double firstNumber, char operator, double secondNumber) {
		Calculator calculator = new Calculator(firstNumber, operator, secondNumber);
		double answer = calculator.totalNum();

		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");
		mv.addObject("answer", answer);
		return mv;
	}

}
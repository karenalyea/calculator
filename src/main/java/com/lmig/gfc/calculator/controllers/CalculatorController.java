package com.lmig.gfc.calculator.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lmig.gfc.calculator.models.Calculator;

@Controller
public class CalculatorController {

	private ArrayList<Calculator> inputList;
	ModelAndView mv;

	public CalculatorController() {
		inputList = new ArrayList<Calculator>();
		mv = new ModelAndView();
	}

	@RequestMapping("/")
	public ModelAndView total(Double firstNumber, String operator, Double secondNumber) {
		Calculator calculator = new Calculator(firstNumber, operator, secondNumber);
		Double answer = calculator.totalNum();

		int index = 0;

		inputList.add(index, calculator);

		mv.setViewName("calculator");
		mv.addObject("answer", answer);
		if (operator != null) {
			mv.addObject("inputList", inputList);
		}
		mv.addObject("arbitraryImage",
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT9eL-elhhI_24O6kmcDxX9C4yI1ClkU8vHRZiXjj_nFSTLvFPW");
		return mv;
	}

}
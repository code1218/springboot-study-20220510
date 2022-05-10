package com.springboot.study.web.controller.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/add")
	public String add(@RequestParam("v") List<Integer> values) {
		int result = 0;
		for(int i : values) {
			result += i;
		}
		return Integer.toString(result);
	}
	
	@GetMapping("/div")
	public String div(int a, int b) {
		if(a == 0 || b == 0) {
			return "0으로 계산 할 수 없습니다.";
		}else {
			return Integer.toString(a / b);
		}
	}
	
	//
	/*
	 * 요청 리소스 add(덧셈), sub(뺄셈), mul(곱셈), div(나눗셈)
	 * 파라미터 a, b
	 * 
	 * div 파라미터가 둘중 하나라도 0이면 '0으로 계산 할 수 없습니다.'
	 * 
	 */
	

	
}

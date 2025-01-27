package com.capgemini.java.lambdas;

import java.util.function.Function;

public class FunctionTest1 {

	public static void main(String[] args) {
		String str = "Java";
		
		//Function<String, Integer> strLenFun = st -> st.length();
		Function<String, String> strLenFun = st -> st.toUpperCase();
		System.out.println(strLenFun.apply(str));
	}
}

package com.wipro.java.lambdas;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		String str = "Wipro";		
		Function<String, Integer> lengthFunction = t -> t.length();		
		System.out.println(lengthFunction.apply(str));
		
		Function<String, String> strUpperFun = st -> st.toUpperCase();
		System.out.println(strUpperFun.apply(str));
	}
}
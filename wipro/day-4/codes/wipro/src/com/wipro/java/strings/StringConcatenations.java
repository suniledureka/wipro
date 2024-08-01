package com.wipro.java.strings;

public class StringConcatenations {

	public static void main(String[] args) {
		String s1 = "Wipro";
		String company = s1.concat(" Technologies");
		System.out.println(company);

		company = s1 + " Technologies";
		System.out.println(company);
		
		//---- difference between concat() & +  in string concatenations
		//1. type of data
		int companyId = 87654;
		//s1.concat(companyId); //compilation error
		company = s1 + companyId;
		System.out.println(company);
		
		//2. number of arguments
		//s1.concat("Tech", "nologies"); //compilation error
		company = s1 + " Tech " + companyId + " nologies";
		System.out.println(company);
		
		//3. NullPointerException
		//company = s1.concat(null); //java.lang.NullPointerException
		company = s1 + null;
		System.out.println(company);
		
		//4. efficiency
		String str = s1.concat("");
		System.out.println(str == s1); //true
		
		str = s1 + "";
		System.out.println(str == s1); //false
	}

}

package com.kodnest.learningManagement.encapsulation;
import java.util.Scanner;
public class Calculator {
	
	public static void main(String[] args) {
		double a,b,res;
		String typeOfOperator;
		Scanner scan=new Scanner(System.in);
		System.out.println("select the operator: +,-,*,/");
		typeOfOperator=scan.nextLine();
		System.out.println("Enter the first number");
		a=scan.nextDouble();
		System.out.println("Enter the second number");
		b=scan.nextDouble();
		switch(typeOfOperator)
		{
		case "+":
	         res=a+b;
	         System.out.println(a+"+"+b+ "="+res);
	         break;
		case "-":
	         res=a-b;
	         System.out.println(a+"-"+b+ "="+res);
	         break;
		case "*":
	         res=a*b;
	         System.out.println(a+"*"+b+ "="+res);
	         break;
		case "/":
	         res=a/b;
	         System.out.println(a+"/"+b+ "="+res);
	         break;
		}
		

		

	}

}

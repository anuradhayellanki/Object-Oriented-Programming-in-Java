/**
 * abstraction package created on 30-may-2022
 */
package com.cashapona.oops.abstraction.may30;
/**
 * @author Anuradha
 */
abstract class Calculator{
	/*
	 * @params a,b of calculate() abstract method
	 */
	abstract void calculate(int a, int b);
}
/*
 * Addition class aquiring properties from MyTest abstract class
 */
class Addition extends Calculator{
	/*
	 * overirde calculate method with parameters a,b
	 */
	void calculate(int a, int b) {
		System.out.println("Addition of given two numbers : "+(a+b));
	}
}
/*
 * Subtraction class inherit properties from MyTest abstract class
 */
class Subtraction extends Calculator{
	/*
	 * overirde calculate method with parameters a,b
	 */
	void calculate(int a, int b) {
		System.out.println("Subtraction of given two numbers : "+(a-b));
	}
}
/*
 * Multiplication class aquiring properties from MyTest abstract class
 */
class Multiplication extends Calculator{
	/*
	 * overirde calculate method with parameters a,b
	 */
	void calculate(int a, int b) {
		System.out.println("Multiplication of given two numbers : "+(a*b));
	}
}
public class AbstractionTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * No need to create object for Calculator class because it is abstract class.
		 * create objects for Addition , subtraction and multiplication classes.
		 */
		Addition add=new Addition();
		Subtraction sub=new Subtraction();
		Multiplication mul=new Multiplication();
		/*
		 * calling methods of Addition , subtraction and multiplication classes
		 */
		add.calculate(20, 0);
		sub.calculate(20,10);
		mul.calculate(12, 100);
	}
}

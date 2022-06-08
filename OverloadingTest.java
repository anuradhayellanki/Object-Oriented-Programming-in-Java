package com.cashapona.oops.polymorphism.may31;
/**
 * @author Anuradha
 * created Addition class
 */
class Addition{
	/*
	 * @params a,b of int type in add() overloading
	 */
	public void add(int a,int b) {
		System.out.println("Addition of two integer values : "+(a+b));
	}
	/*
	 * @params a,b,c of float type in add() overloading
	 */
	public void add(float a,float b) {
		System.out.println("Addition of two Float values : "+(a+b));
	}
	/*
	 * @params a,b of double type in add() overloading
	 */
	public void add(double a,double b,double c) {
		System.out.println("Addition of two double values : "+(a+b+c));
	}
}
public class OverloadingTest extends Addition {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition addition=new Addition();
		addition.add(2,23);
		addition.add(2.1f,3.1f);
		addition.add(146777,1344,2);
	}
}

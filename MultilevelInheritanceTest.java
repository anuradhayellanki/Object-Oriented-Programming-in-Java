/**
 * com.cashapona.oops.inheritance on 31-may-2022
 */
package com.cashapona.oops.inheritance.may31;
/**
 * @author Anuradha
 */
class Animal{
	void eat() {
		System.out.println("eating...");
	}
}
class Dog extends Animal{  
	void bark(){
		System.out.println("Dog barking...");
	}  
}  
class BabyDog extends Dog{  
	void weep(){
		System.out.println("Baby Dog weeping...");
	}  
}  
public class MultilevelInheritanceTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BabyDog d=new BabyDog();  
		d.weep();  
		d.bark();  
		d.eat();  
		}
}

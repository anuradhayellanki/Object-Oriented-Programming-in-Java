package com.cashapona.oops.inheritance.may31;
/**
 * @author USER
 * parent class Employee 
 * Every employee has a standard salary of Rs.50000. For a full-time employee, increment the salary by 50%, and increment the salary by 25% for an intern. After increasing the salary, display the incremented salary.
 */
class Employee {
	 double salary = 50000;
	 void displaySalary(){
	   System.out.println("Employee Salary: Rs."+salary);
	 }
}	 
/*
 *  child class FullTimeEmployee inherits from Employee using extend keyword
 */
class FullTimeEmployee extends Employee{
	 double hike = 0.50;
	 void incrementSalary(){
	   salary = salary + (salary * hike);
	 }
}
/*
 *  child class InternEmployee extends Employee
 */
class InternEmployee extends Employee{
	 double hike = 0.25;
	 void incrementSalary(){
	   salary = salary + (salary * hike);
	 }
}
class HierarchicalInheritanceTest{	 
	 public static void main(String[] args) {
	   // object created for subclasses FullTimeEmployee , InternEmployee
	   FullTimeEmployee emp1 = new FullTimeEmployee();
	   InternEmployee emp2 = new InternEmployee();
	   System.out.println("Salary of a full-time employee before incrementing:");
	   //display FullTimeEmployee method
	   emp1.displaySalary();
	   System.out.println("Salary of an intern before incrementing:");
	   //display InternEmployee method
	   emp2.displaySalary();
	    // display salary incremented
	   emp1.incrementSalary();
	   emp2.incrementSalary();
	   System.out.println("Salary of a full-time employee after incrementing:");
	   emp1.displaySalary();
	   System.out.println("Salary of an intern after incrementing:");
	   emp2.displaySalary();
	 }
}

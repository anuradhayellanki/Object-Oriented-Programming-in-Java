package com.cashapona.oops.polymorphism.may31;
/**
 * @author Anuradha
 */
class Employee{
	private String name;
	private String address;
	private int age;
	public Employee(String name, String address, int age) {
		this.name = name;
	    this.address = address;
	    this.age = age;
	}
	public void mailCheck() {
	      System.out.println("Within mailCheck of Employee class ");
	      System.out.println("Mailing a check to " + this.name + " " + this.address);
	}
	/**
	 * @return the name
	 */
	protected String getName() {
		return name;
	}
	/**
	 * @return the address
	 */
	String getAddress() {
		return address;
	}
	/**
	 * @return the age
	 */
	int getAge() {
		return age;
	}
	/**
	 * @param name the name to set
	 */
	@SuppressWarnings("unused")
	private void setName(String name) {
		this.name = name;
	}
	/**
	 * @param address the address to set
	 */
	@SuppressWarnings("unused")
	private void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @param salary the salary to set
	 */
	@SuppressWarnings("unused")
	private void setAge(int age) {
		this.age = age;
	}
	public String toString() {
	      return name + " " + address + " " + age;
	   }
}
class Salary extends Employee{
	private double salary;
	public Salary(String name, String address, int age,double salary) {
		super(name,address,age);
		setSalary(salary);
	}
	public void mailCheck() {
	      System.out.println("Mailing check to " + getName()+ " with salary " + salary);
	   }
	/**
	 * @return the salary
	 */
	double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	private void setSalary(double salary) {
		this.salary = salary;
		
	}
}
public class OverridingTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create object sal for Salary class
	    System.out.println("Within mailCheck of Salary class ");
		Salary sal=new Salary("John","Hyderabad",29,50000);
		Salary sal1=new Salary("Himams","Khammam",21,3000);
		Salary sal2=new Salary("Keerthana","Banglore",22,50000);
		//create object emp for Employee class
		Employee emp=new Salary("Aadvik","Kolkata",34,40000);
		//calling override mailCheck() method for sal object
		sal.mailCheck();
		//calling override mailCheck() method for sal1 object
		sal1.mailCheck();
		//calling override mailCheck() method for sa2 object
		sal2.mailCheck();	
		System.out.println();
	    System.out.println("Within mailCheck of Employee class ");
		//calling override mailCheck() method for emp object
		emp.mailCheck();
		System.out.println();
		//print all employee details 
		System.out.println("Print all Employee And Salary class records : ");
		System.out.println(sal);
		System.out.println(sal1);
		System.out.println(sal2);
		System.out.println(emp);
		//get particular emp name and salary , age and address using getName() , getSalary(),getSalary(),getAddreess()
		System.out.println();
		System.out.println("Employee name : "+emp.getName()+" , "
				+ "live in : "+emp.getAddress()+" , age : "+emp.getAge()+" , getting salary : "+sal.getSalary());
		System.out.println("Employee name : "+sal.getName()+" , "
				+ "live in : "+sal.getAddress()+" , age : "+sal.getAge()+" , getting salary : "+sal.getSalary());
		}
}

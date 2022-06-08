/**
 * created abstraction package on 30-may-2022
 */
package com.cashapona.oops.abstraction.may30;
/**
 * @author Anuradha
 * created class EmployeeDetails having commonEmployeeDetails,confidentialDetails methods
 */
abstract class EmployeeDetails{
	/*
	* @params name as String,id as int
	*/
	public void commonEmployeeDetails(String name, int id) {
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Id : "+id);
	}
	/*
	* created abstract method confidentialDetails() 
	* @params id as int, str as String
	*/
	public abstract void confidentialDetails(int id,String str);
}
/*
* created HR class extends EmployeeDetails
* /
class HR extends EmployeeDetails{
	/*
	*@override confidentialDetails()
	*@params id, str
	*/
	public void confidentialDetails(int id,String str) {
		System.out.println("Salary = "+id);
		System.out.println("Performance : "+str);
	}
}
public class EmployeeAbstractionTest  {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		*create hr object for HR class
		*/
		HR hr=new HR();
		//calling commonEmployeeDetails() and confidentialDetails methods
		hr.commonEmployeeDetails("Sharadha",101);
		hr.confidentialDetails(40000,"Good");
	}
}


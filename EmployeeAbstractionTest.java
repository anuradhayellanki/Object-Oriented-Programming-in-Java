/**
 * 
 */
package com.cashapona.oops.abstraction.may30;

/**
 * @author USER
 *
 */
abstract class EmployeeDetails{
		public void commonEmployeeDetails(String name, int id) {
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Id : "+id);
	}
	public abstract void confidentialDetails(int id,String str);
}
class HR extends EmployeeDetails{
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
		HR hr=new HR();
		hr.commonEmployeeDetails("Sharadha",101);
		hr.confidentialDetails(40000,"Good");
	}
}


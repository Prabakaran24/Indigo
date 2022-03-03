package org.emp;

public class Employee {
	private void empName() {
		System.out.println("prabakaran");
	}
	private void empDob() {
		System.out.println("24-11-1998");

	}
	private void empPhone() {
		System.out.println("987654321");
	}
	private void empEmail() {
       System.out.println("prabakaran@gmail.com");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empName();
		e.empDob();
		e.empPhone();
		e.empEmail();
		
	}
	

}

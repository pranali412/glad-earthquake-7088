package com.masai.usecases;

import java.util.Scanner;

import com.masai.ConsoleColors.ConsoleColors;
import com.masai.bean.Employee;
import com.masai.checkdetails.Check;
import com.masai.dao.AdminDaoImpl;

public class Addemployee {

	public void addemp() {
		
		AdminDaoImpl adi = new AdminDaoImpl();
		Scanner s = new Scanner(System.in);
		System.out.println(ConsoleColors.LIGHT_PINK+"Enter Employee Name "+ConsoleColors.RESET);
		String name = s.nextLine();
		String salary = Check.checkSalary();
		System.out.println(ConsoleColors.LIGHT_PINK+"Enter Employee Role"+ConsoleColors.RESET);
		String role = s.nextLine();
		String deptid = Check.checkDeptid();
		String email =  Check.checkEmail();
		String password = Check.checkPassword();
		Employee emp = new Employee(name, salary, role, password, email,deptid);
		String res = adi.addEmployee(emp);
		System.out.println(res);
		System.out.println("==================================================");
		
	
	}
	
}

package com.masai.usecases;

import java.util.Scanner;

import com.masai.ConsoleColors.ConsoleColors;
import com.masai.checkdetails.Check;
import com.masai.dao.AdminDaoImpl;

public class AddDepartment {
	
	public void addDepartment() {
		
		Scanner s = new Scanner( System.in);
		String deptid = Check.checkDeptid();
		System.out.println(ConsoleColors.LIGHT_PINK+"Enter Department Name"+ConsoleColors.RESET);
		String deptName = s.nextLine();
		
		AdminDaoImpl adi = new AdminDaoImpl();
		String res = adi.addDepartment(deptid,deptName);
		System.out.println(res);
		System.out.println("==================================================");
		
		
	}
	

}

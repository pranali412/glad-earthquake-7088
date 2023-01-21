package com.masai.usecases;

import java.util.Scanner;

import com.masai.ConsoleColors.ConsoleColors;
import com.masai.checkdetails.Check;
import com.masai.dao.AdminDaoImpl;

public class UpdateDepartment {

	public void updateDept() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println(ConsoleColors.LIGHT_PINK+"Enter New Department Name"+ConsoleColors.RESET);
		String deptname = s.nextLine();
		
		AdminDaoImpl adi = new AdminDaoImpl();
		 System.out.println(adi.updateDepartment(deptname));
		 System.out.println("==================================================");
		 
	}
	
	
	
}

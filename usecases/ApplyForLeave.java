package com.masai.usecases;

import com.masai.ConsoleColors.ConsoleColors;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class ApplyForLeave {

	int id;
	
	public ApplyForLeave() {
	
	}
	
	public ApplyForLeave(int id) {
		super();
		this.id = id;
	}
	
	public void forLeave() {
		
		EmployeeDao ed = new EmployeeDaoImpl();
		String res = ed.applyForLeave(id);
		System.out.println(ConsoleColors.GREEN_BOLD+res+ConsoleColors.RESET);
		System.out.println("==================================================");
		
	}
	
	
	
}

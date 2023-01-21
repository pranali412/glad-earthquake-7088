package com.masai.usecases;

import java.util.List;

import com.masai.ConsoleColors.ConsoleColors;
import com.masai.bean.Department;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exception.DepartmentException;

public class GetAllDepartments {

	public void getAllDept() {
		
		AdminDao ad = new AdminDaoImpl();
		
		
		try {
			List<Department> list = ad.getAllDepartments();
			
			if(list.size() != 0) {
				
				for(Department d : list) {
					
					System.out.println(ConsoleColors.PURPLE_BOLD+"Department Id Is          :        "+ d.getDepId()+ConsoleColors.RESET);
					System.out.println(ConsoleColors.PURPLE_BOLD+"Department Name Is        :        "+d.getDepName()+ConsoleColors.RESET);
					System.out.println("==================================================");
					
				}
				
				
			}
			
		} catch (DepartmentException e) {
			
			System.out.println(e.getMessage());
			System.out.println("==================================================");
		}
		
	}
	

	
	
	
}

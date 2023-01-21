package com.masai.usecases;

import java.util.List;

import com.masai.ConsoleColors.ConsoleColors;
import com.masai.bean.Employee;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exception.EmployeeException;

public class GetAllEmployee {

	public void allEmp() {
		
		AdminDao ad = new AdminDaoImpl();
		
		try {
			List<Employee> list = ad.getAllEmployees();
			
			for(Employee e : list) {
				
				System.out.println(ConsoleColors.PURPLE_BOLD+"Employee Id Is                    :       "+e.getEmpId()+ConsoleColors.RESET);
				System.out.println(ConsoleColors.PURPLE_BOLD+"Employee Name Is                  :       "+e.getEmpName()+ConsoleColors.RESET);
				System.out.println(ConsoleColors.PURPLE_BOLD+"Employee Working In Deparment     :       "+e.getDeptId()+ConsoleColors.RESET);
				System.out.println(ConsoleColors.PURPLE_BOLD+"Employee Salary Is                :       "+e.getEmpSalary()+ConsoleColors.RESET);
				System.out.println(ConsoleColors.PURPLE_BOLD+"Employee Role Is                  :       "+e.getEmpRole()+ConsoleColors.RESET);
				System.out.println("========================================================");
				
			}
			
		} catch (EmployeeException e) {
			
			System.out.println(e.getMessage());
			System.out.println("==================================================");
		}
		
		
		
		
	}
	
	
	
}

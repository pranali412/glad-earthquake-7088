package com.masai.application;
import java.io.Console;
import java.util.Scanner;

import com.masai.ConsoleColors.ConsoleColors;
import com.masai.bean.Admin;
import com.masai.bean.Employee;
import com.masai.checkdetails.Check;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exception.AdminException;
import com.masai.exception.EmployeeException;

public class AdminOrEmployee {

	public static void choice() {
		
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println(" Press \n 1.) Login Admin \n 2.) Login Employee \n 3.) Exit \n==================");
			int value = s.nextInt();
			s.nextLine();
			
			switch(value) {
			
			case 1 : 
			{
				
				String email = Check.checkemail();
				String pass = Check.checkPass();
				
				try {
					
					AdminDao adi = new AdminDaoImpl();
					Admin admin = adi.loginForAdmin(pass, email);
					
					System.out.println(ConsoleColors.GREEN_BOLD + " Welcome  --> "+admin.getName() + ConsoleColors.RESET);
					System.out.println("================================");
					AdminOperations ao = new AdminOperations(pass,email);
					ao.adminOper();
					
				} catch (AdminException e) {
					System.out.println(e.getMessage());
					System.out.println("=================================");
					choice();
				}
				break;
			}	
				
			case 2 :
			{	
				
				
				String email = Check.checkemail();
				String pass = Check.checkPass();
				try {
					
					EmployeeDao ed = new EmployeeDaoImpl();
					Employee employee = ed.loginForEmployee(pass, email);
					
					
					System.out.println(ConsoleColors.GREEN_BOLD + "Welcome --> "+employee.getEmpName() +"   Id is -->  "+employee.getEmpId()+ ConsoleColors.RESET);
					System.out.println("========================================================================");
					EmployeeOperations eo = new EmployeeOperations(employee.getEmpId());
					eo.employeeOper();
					
				} catch (EmployeeException e) {
					System.out.println(e.getMessage());
					choice();
					
				}
				break;
			}
			case 3 :
			{
				return;
			}
			default :
				System.out.println(ConsoleColors.RED +"Please Press Valid Number"+ ConsoleColors.RESET);
				System.out.println("=========================");
				choice();
				break;
			}
			
			
			
			
		} catch (Exception e) {
			System.out.println(ConsoleColors.RED +"Please Enter Only Number"+ ConsoleColors.RESET);
			System.out.println("=========================");
			choice();
		}

	}
}

package com.masai.checkdetails;
import java.util.Scanner;

import com.masai.ConsoleColors.ConsoleColors;


public class Check {

	//////////////////////////////checking password credentails/////////////////////////
	public static String passwordCredentials(String s) {
		
		String  message = null;
		
		if(s.length() < 4) {
			message =ConsoleColors.RED +  "Password Length Must Be Greater Or Equal To 4"+ ConsoleColors.RESET;
		}else if(s.contains("@") || s.contains("#") || s.contains("$") || s.contains("%") || s.contains("&")) {
			
			message ="Strong Password";
			
		}else {
			message = ConsoleColors.RED + "Password Must Contain At Least One Character From -->  @,#,$,%,& "+ ConsoleColors.RESET;
		}
		
		
		return message;
		
	}
	
	/////////////////////////////////check password/////////////////////////////////////////
	
	public static String checkPassword() {
		
		boolean flag1 = true;
		Scanner sc = new Scanner(System.in);
		String password=null;
		while(flag1) {
			System.out.println("Give Employee Default Password");
			
			String pass = sc.nextLine();
			password = pass;
			String res = Check.passwordCredentials(pass);
			if(res.equals("Strong Password")) {
				flag1 = false;
			}else {
			System.out.println(res);
			System.out.println("==============================");
			}
		}
		
		return password;
		
	}
	
	///////////////////////////////////////checking email Credentials////////////////////////////////////////////////////////////
	
	public static String emailCredentials(String e) {
		
		String message = "Strong Email";
		
		if(e.length() < 11) {
			message = ConsoleColors.RED+"Length Of Email Must Be Greater Than 8 Including ->  @gmail.com"+ConsoleColors.RESET;
		}
		else if(e.contains("!") || e.contains("#") || e.contains("$") || e.contains("%") || e.contains("&")) {
			
			if(e.contains("@gmail.com")) {
				
				message ="Strong Email";
			}else {
				message = ConsoleColors.RED+"Email Must Contain ->  @gmail.com"+ConsoleColors.RESET;
			}
			
		}
	else {
			message = "Email Must Contain At Least One Character From -->  !,#,$,%,&";
		}
		
		
		return message;
	}
	
	/////////////////////////// check email////////////////////////////////////////////
	
	public static String checkEmail() {
		
		boolean flag2 = true;
		Scanner sc = new Scanner(System.in);
		String email=null;
		while(flag2) {
			System.out.println(ConsoleColors.LIGHT_PINK+"Enter Employee Email"+ConsoleColors.RESET);
			String e = sc.nextLine();
			email = e;
			String res = Check.emailCredentials(e);
			if(res.equals("Strong Email")) {
				flag2 = false;
			}else {
			System.out.println(res);
			System.out.println("=====================");
			}
		}
		
		return email;
		
	}
	
	///////////////////////////////Check Salary Credentials///////////////////////////////////////////
	
	
	public static String checkSalary() {
		
		Scanner s = new Scanner(System.in);
		boolean flag3 = true;
		String salary=null;
		while(flag3) {
		System.out.println(ConsoleColors.LIGHT_PINK+"Enter Employee Salary"+ConsoleColors.RESET);
		String sal = s.nextLine();
			try {
				Double x = Double.parseDouble(sal);
				salary = x+"";
				flag3 = false;
				
				}catch(Exception e) {
					System.out.println(ConsoleColors.RED+"Please Enter Number Only"+ConsoleColors.RESET);
					System.out.println("========================");
				}
		}
		
		return salary;
	}
	
	
	
	////////////////////////////check departmentId//////////////////////////////
	
	public static String checkDeptid() {
		
		Scanner s = new Scanner(System.in);
		boolean flag = true;
		String deptid=null;
		while(flag) {
		System.out.println(ConsoleColors.LIGHT_PINK+"Enter Department ID"+ConsoleColors.RESET);
		String did = s.nextLine();
			try {
				int x = Integer.parseInt(did);
				deptid = x+"";
				flag = false;
				}catch(Exception e) {
					System.out.println(ConsoleColors.RED+"Please Enter Number Only"+ConsoleColors.RESET);
					System.out.println("========================");
				}
		}
		
		return deptid;
	}
	
	///////////////////////check employeeId////////////////////////
	
	
	public static String checkEmpId() {
		
		Scanner s = new Scanner(System.in);
		boolean flag = true;
		String deptid=null;
		while(flag) {
		System.out.println(ConsoleColors.LIGHT_PINK+"Enter Employee ID"+ConsoleColors.RESET);
		String did = s.nextLine();
			try {
				int x = Integer.parseInt(did);
				deptid = x+"";
				flag = false;
				}catch(Exception e) {
					System.out.println(ConsoleColors.RED+"Please Enter Number Only"+ConsoleColors.RESET);
					System.out.println("=========================");
				}
		}
		
		return deptid;
	}
	////////////////////////check leave duration /////////////////////
	public static String checkLeaveDur() {
		
		Scanner s = new Scanner(System.in);
		boolean flag = true;
		String deptid=null;
		while(flag) {
		System.out.println(ConsoleColors.LIGHT_PINK+"Enter Leave Duration In Days");
		String did = s.nextLine();
			try {
				int x = Integer.parseInt(did);
				deptid = x+"";
				flag = false;
				}catch(Exception e) {
					System.out.println(ConsoleColors.LIGHT_PINK+"Please Enter Number Only"+ConsoleColors.RESET);
					System.out.println("=========================");
				}
		}
		
		return deptid;
	}
	
	///////////////////////// check employee choice /////////////////////////
	
	public static String checkChoicesForEmp() {
		
		Scanner s = new Scanner(System.in);
		boolean flag = true;
		String deptid=null;
		while(flag) {
		System.out.println("Press\n 1.) View Your Profile \n 2.) Update Your Profile \n 3.) Apply For Leave \n 4.) Leave Response From Admin \n 5.) Back To Home Screen ");
		System.out.println("=====================================================");
		String did = s.nextLine();
			try {
				int x = Integer.parseInt(did);
				deptid = x+"";
				flag = false;
				}catch(Exception e) {
					System.out.println(ConsoleColors.RED+"Please Enter Number Only"+ConsoleColors.RESET);
					System.out.println("========================");
				}
		}
		
		return deptid;
	}
	////////////// check admin choice ////////////////////////////////////////
	
	public static String checkChoicesForAdmin() {
		
		Scanner s = new Scanner(System.in);
		boolean flag = true;
		String deptid=null;
		while(flag) {
		System.out.println("Press\n 1.) Update Your Profile \n 2.) Add New Employee \n 3.) Transfer Employee from One Department To Another \n 4.) Get All The Employees Details \n 5.) Add New Department \n 6.) Update Department Name \n 7.) Get All Departments Details \n 8.) Get All Employees Leave Details \n 9.) Respond To Employee Leave \n 10.) Back to Home screen \n");
		System.out.println("======================================================");
		String did = s.nextLine();
			try {
				int x = Integer.parseInt(did);
				deptid = x+"";
				flag = false;
				}catch(Exception e) {
					System.out.println(ConsoleColors.RED+"Please Enter Number Only"+ConsoleColors.RESET);
					System.out.println("=========================");
				}
		}
		
		return deptid;
	}
	
	
	/////////////////////// check login Password ///////////////////////
	
	public static String checkPass() {
		
	
		
		boolean flag1 = true;
		Scanner sc = new Scanner(System.in);
		String password=null;
		while(flag1) {
			System.out.println(ConsoleColors.LIGHT_PINK + "Enter Password"+ConsoleColors.RESET);
			String pass = sc.nextLine();
			password = pass;
			String res = Check.passwordCredentials(pass);
			if(res.equals("Strong Password")) {
				flag1 = false;
			}else {
			System.out.println(res);
			System.out.println("====================================================");
			}
		}
		
		return password;
		
	}
	
	////////////////////// check login email /////////////////////////////
	
	public static String checkemail() {
		
		boolean flag2 = true;
		Scanner sc = new Scanner(System.in);
		String email=null;
		while(flag2) {
			System.out.println(ConsoleColors.LIGHT_PINK +"Enter Email"+ConsoleColors.RESET);
			String e = sc.nextLine();
			email = e;
			String res = Check.emailCredentials(e);
			if(res.equals("Strong Email")) {
				flag2 = false;
			}else {
			System.out.println(res);
			System.out.println("================================================");
			}
		}
	
		return email;
		
	}
	
}

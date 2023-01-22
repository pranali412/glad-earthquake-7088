package com.masai.usecases;

import com.masai.ConsoleColors.ConsoleColors;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;

public class LeaveRespond {
	
	public void leaveRespond() {
		
		AdminDao ad = new AdminDaoImpl();
		String res = ad.respontToLeaveRequest();
		System.out.println(ConsoleColors.GREEN_BOLD+res+ConsoleColors.RESET);
		System.out.println("==================================================");
	}

}

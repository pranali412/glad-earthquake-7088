package com.masai.usecases;

import java.util.List;

import com.masai.ConsoleColors.ConsoleColors;
import com.masai.bean.Leave;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exception.LeaveException;

public class GetAllLeaves {

	
	public void getAllLeaves() {
		AdminDao ad = new AdminDaoImpl();
	
		try {
			List<Leave> list = ad.getAllLeavesRequest();
			
			for(Leave l : list) {
				System.out.println(ConsoleColors.PURPLE_BOLD+"Leave Number Is          :      "+l.getLeaveNum()+ConsoleColors.RESET);
				System.out.println(ConsoleColors.PURPLE_BOLD+"Employee Id Is           :      "+l.getEmpId()+ConsoleColors.RESET);
				System.out.println(ConsoleColors.PURPLE_BOLD+"Employee Name Is         :      "+l.getName()+ConsoleColors.RESET);
				System.out.println(ConsoleColors.PURPLE_BOLD+"Leave Duration In Days   :      "+l.getDuration()+ConsoleColors.RESET);
				System.out.println(ConsoleColors.PURPLE_BOLD+"Leave Reason             :      "+l.getReason()+ConsoleColors.RESET);
				System.out.println("=================================================");
			}
			
		} catch (LeaveException e) {
			System.out.println(e.getMessage());
			System.out.println("==================================================");
		}
	
	}
	
}

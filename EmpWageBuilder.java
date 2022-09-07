package com.bl.empwageoops;

import java.util.Random;

public class EmpWageBuilder {
	
	public static void main(String[] args) {
		
//Main-Branch
		  System.out.println("Welcome to Employee Wage Computation Program :)");
		  
//UC-1-Check Employee is Present or Absent
		  Random empCheck = new Random();
	      int n = empCheck.nextInt(2);
		  if (n == 1)
				System.out.println("Employee is Present");
			     else
					System.out.println("Employee is Absent");
//UC2-Calculate Daily Employee Wage
			int workingHrs = 8;
			int dailyWage = workingHrs * 20 ;
			System.out.println("Daily wage of employee is --> $" + dailyWage );
			
//UC3-Add Part time Employee & Wage
			workingHrs = 8;
			dailyWage = workingHrs * 20 ;
			System.out.println("Part time wage of employee is --> $" + dailyWage );
			
//UC4-Solving using Switch Case Statement
			int empRatePerHr = 20;
			int workingDays = 20;
			int monthlyWage;
			switch ((int)(n)) {
					
			  case 0 :
					workingHrs = 8;
					dailyWage = empRatePerHr * workingHrs;
					monthlyWage = dailyWage * workingDays;
					System.out.println("Employee is working Part Time");
					System.out.println("Daily wage of employee is --> $" + dailyWage );
				    break;
					
			  case 1 :
						workingHrs = 8;
						dailyWage = empRatePerHr * workingHrs;
						monthlyWage = dailyWage * workingDays;
						System.out.println("Employee is working Full Time");
						System.out.println("Daily wage of employee is --> $" + dailyWage );
						
			  default :
					workingHrs = 0;
					break;
				
				}
	}

}

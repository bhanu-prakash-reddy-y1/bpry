package com.dev.essportal;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {

	static Scanner scn = new Scanner(System.in);

	static ArrayList<EmployeeInfo> arr = new  ArrayList<EmployeeInfo>();

	static ArrayList<EmployeeLeaveInfo> arr1 = new ArrayList<EmployeeLeaveInfo>();

	static ArrayList<EmployeeLeaveInfo> arr2 = new ArrayList<EmployeeLeaveInfo>();

	public void employeRegistraion() {
		EmployeeInfo ei = new EmployeeInfo();
		System.out.print("Enter EmployeId :");	
		ei.setEmployeeId(scn.nextInt());
		System.out.print("Enter EmployeName :");
		ei.setEmployeeName(scn.next());
		System.out.print("Enter EmployeeType  :");
		ei.setEmployeeType(scn.next());
		System.out.print("Enter Email :");
		ei.setEmail(scn.next());
		System.out.print("Enter Password :");
		ei.setPassword(scn.next());
		arr.add(ei);
		System.out.println("Registred Successfully...!");
		return;
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		EmployeeInfo ei1 = new EmployeeInfo();
		ei1.setEmployeeId(101);
		ei1.setEmployeeName("bhanuPrakash");
		ei1.setEmployeeType("employee");
		ei1.setEmail("qwerty@gmail.com");
		ei1.setPassword("qwerty");
		arr.add(ei1);

		EmployeeInfo ei11 = new EmployeeInfo();
		ei11.setEmployeeId(103);
		ei11.setEmployeeName("prakash");
		ei11.setEmployeeType("employee");
		ei11.setEmail("zxcvb@gmail.com");
		ei11.setPassword("zxcvb");
		arr.add(ei11);

		EmployeeInfo ei2 = new EmployeeInfo();
		ei2.setEmployeeId(102);
		ei2.setEmployeeName("reddy");
		ei2.setEmployeeType("manager");
		ei2.setEmail("asdfgh@gmail.com");
		ei2.setPassword("asdfgh");
		arr.add(ei2);

		EmployeeLeaveInfo el = new  EmployeeLeaveInfo();

		el.setEmployeeId(101);
		el.setLeaveDate("22/22/22");
		el.setLeaveStatus("applying for leave");

		EmployeeLeaveInfo el1 = new  EmployeeLeaveInfo();

		el1.setEmployeeId(101);
		el1.setLeaveDate("22/01/22");
		el1.setLeaveStatus("applying for leave");

		EmployeeLeaveInfo el11 = new  EmployeeLeaveInfo();

		el11.setEmployeeId(103);
		el11.setLeaveDate("22/22/12");
		el11.setLeaveStatus("applying for leave");

		EmployeeLeaveInfo el111 = new  EmployeeLeaveInfo();

		el111.setEmployeeId(103);
		el111.setLeaveDate("22/20/22");
		el111.setLeaveStatus("applying for leave");
		arr1.add(el);
		arr1.add(el1);
		arr2.add(el11);
		arr2.add(el111);

		EmployeeOperations eo = new EmployeeOperations();
		eo.addEmployee("employees", arr);
		eo.addLeaveRequest(arr1, "leaves");
		eo.addLeaveRequest(arr2, "leaves1");

		System.out.println("Enter 1 to register or 2 to login");

		int i  = scn.nextInt();
		if(i==1) {
			e.employeRegistraion();
		}
		i=2;
		while(true) {
			if(i==2) {
				System.out.print("Enter email : ");
				String email  = scn.next();
				System.out.println("Enter password");
				String password  = scn.next();
				if(email.equals(ei11.getEmail()) && password.equals(ei11.getPassword())) {
					System.out.println("login successFully.....!");
					
					if (ei11.getEmployeeType().equals("employee")) {
						System.out.println("Enter 1 to show leave requests/ 2 for leave request");
						int k = scn.nextInt();
						if(k == 1) {
							System.out.println(arr1);
						}
						if(k==2) {
							EmployeeLeaveInfo e1 = new EmployeeLeaveInfo();
							System.out.print("Enter EmployeeId : ");
							int l = scn.nextInt();
							e1.setEmployeeId(l);
							System.out.println("Enter date of leave");
							e1.setLeaveDate(scn.next());
							System.out.print("enter leave Status");
							e1.setLeaveStatus(scn.nextLine());
							if(e1.getEmployeeId() == ei1.getEmployeeId()) {
								arr1.add(e1);
								System.out.println(arr1);
							}
							if(e1.getEmployeeId() == ei11.getEmployeeId()) {
								arr2.add(e1);
								System.out.println(arr2);
							}
						}

					}				
				}else if(email.equals(ei1.getEmail()) && password.equals(ei1.getPassword())) {
					System.out.println("login successFully.....!");
					if (ei1.getEmployeeType().equals("employee")) {
						System.out.println("Enter 1 to show leave requests/ 2 for leave request");
						int k = scn.nextInt();
						if(k == 1) {
							System.out.println(arr1);
						}
						if(k==2) {
							EmployeeLeaveInfo e1 = new EmployeeLeaveInfo();
							System.out.print("Enter EmployeeId : ");
							int l = scn.nextInt();
							e1.setEmployeeId(l);
							System.out.println("Enter date of leave");
							e1.setLeaveDate(scn.next());
							System.out.print("enter leave Status :");
							e1.setLeaveStatus(scn.next());
							if(e1.getEmployeeId() == ei1.getEmployeeId()) {
								arr1.add(e1);
								System.out.println(arr1);
							}
							if(e1.getEmployeeId() == ei11.getEmployeeId()) {
								arr2.add(e1);
								System.out.println(arr2);
							}
						}

					}	
				}else if(email.equals(ei2.getEmail()) && password.equals(ei2.getPassword())) {
					if(ei2.getEmployeeType().equals("manager")) {
						System.out.println("login successFully.....!");
						System.out.println("Enter 1 to see the requests or two to change leave status");
						int j = scn.nextInt();
						if (j==1) {

							eo.showLeaves();

						}
						System.out.print("Enter 2 to change leaveStatus");
						j = scn.nextInt();
						if(j==2) {
							System.out.print("Change leave status for request 1 :");
							el.setLeaveStatus(scn.next());

							System.out.print("change leave Status for request 2 :");
							el1.setLeaveStatus(scn.next());

							System.out.print("change leave Status for request 3 :");
							el11.setLeaveStatus(scn.next());
							eo.showLeaves();
						}
					}
				}else {
					System.out.println("login failed please registor .......!");
					return;
				}
			}

		}
	}
}

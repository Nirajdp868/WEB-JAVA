package tester;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.UserDaoImpl;
import pojos.User;


public class AddData {
	/*
	 * id int (Primary Key : Auto Increment) desc varchar(200) postedDate date
	 * answer varchar(400) status boolean
	 */

	public static void main(String[] args) {
		try(SessionFactory sf=getFactory();Scanner sc=new Scanner(System.in);){
			System.out.println("Enter Details of  id, DESC, Date, Answer ,Status");
			
			System.out.println("Enter Desc: ");
			String desc=sc.next();
			System.out.println("Enter Date(year-month-date): ");
			String date=sc.next();
			System.out.println("Enter Answer: ");
			String ans=sc.next();
			System.out.println("Enter Status: ");
			boolean status=sc.nextBoolean();
			//User user=new User( desc, LocalDate.parse(date),ans, status);
			User user=new User( desc, LocalDate.parse(date),ans);
			   UserDaoImpl dao=new UserDaoImpl();
			   System.out.println(dao.addData(user));
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}

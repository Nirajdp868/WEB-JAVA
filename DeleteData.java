package tester;

import java.util.Scanner;

import dao.UserDaoImpl;

public class DeleteData {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("Enter UserId");
			
			   UserDaoImpl dao=new UserDaoImpl();
			   System.out.println(dao.deleteUserDetails(sc.nextInt()));
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
}

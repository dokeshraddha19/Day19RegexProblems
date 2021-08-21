package org.example.regex;
import java.util.regex.Matcher;
import java.util.*;
import java.util.regex.Pattern;
public class User_Registration {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name");
		String FirstName=sc.nextLine();
		System.out.println("Enter the Last Name");
		String LastName=sc.nextLine();
		System.out.println("Enter the EmailId");
		String EmailId=sc.nextLine();
		System.out.println("Enter the Mobile Number");
		String MobileNumber =sc.nextLine();
		System.out.println("Enter the Password");
		String PassWord =sc.nextLine();
		sc.close();
		boolean result=Use_cases.UserfirstName(FirstName);
		if(result==true) {
			System.out.println("User First Name is Valid");
		}else {
			System.out.println("User First Name is Invalid");
		}
		boolean last=Use_cases.UserfirstName(LastName);
		if(last==true) {
			System.out.println("User Last Name is Valid");
		}else {
			System.out.println("User Last Name is Invalid");
		}
		boolean emailid=Use_cases.UserEmailvalidation(EmailId);
		if(emailid==true) {
			System.out.println("User EmailId is Valid");
		}else {
			System.out.println("User EmailId is Invalid");
		}
		boolean mobilenumber=Use_cases.UserMobilenumber(MobileNumber);
		if(mobilenumber==true) {
			System.out.println("User Mobilenumber is Valid");
		}else {
			System.out.println("User Mobilenumber is Invalid");
		}
		
	
		boolean password=Use_cases.UserPassWord(PassWord);
		if(password==true) {
			System.out.println("User Password is Valid");
		}else {
			System.out.println("User Password is Invalid");
		}
		
	}
	
	
}
public class Use_cases {
	static boolean UserfirstName(String FirstName) {
		String regex= "^[A-Z]{1}[a-z]{3,}$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(FirstName);
		return matcher.matches();
		
	}
	 static boolean UserlastName(String LastName) {
		String regex= "^[A-Z]{1}[a-z]{3,}$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(LastName);
		return matcher.matches();
		
	}
	 static boolean UserEmailvalidation(String EmailId) {
		 String regex= "^^[0-9a-zA-Z]+([+_.-][0-9a-zA-Z]+)*@[a-zA-Z0-9]+([.][a-zA-Z]{2,3}){1,2}$";
			Pattern pattern=Pattern.compile(regex);
			Matcher matcher=pattern.matcher(EmailId);
			return matcher.matches();
	 }
	 static boolean UserMobilenumber(String MobileNumber) {
		 String regex= "^[0-9]{2}[ ][0-9]{10}$";
			Pattern pattern=Pattern.compile(regex);
			Matcher matcher=pattern.matcher(MobileNumber);
			 return matcher.matches();
	 }
	 static boolean UserPassWord(String PassWord) {
		 String regex= "^[A-Za-z]{1,}[!@#$%^&*()_-]{1}[0-9]{1,}$";
			Pattern pattern=Pattern.compile(regex);
			Matcher matcher=pattern.matcher(PassWord);
			return matcher.matches();
	 }
}


package com.Exception;

public class RegistrationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Registration r1=new Registration("lakshmi","lakshmi@gmail.com","1234567",200,2500);
		Registration r2=new Registration("lakshmi","lakshmi@gmail.com","1234567",200,2500);
		System.out.println(r1);
		System.out.println(r2);
		if(r1.equals(r2)){
			System.out.println("Both are equal");
		}
			else
				System.out.println("Not Equal Strings");
		}
}


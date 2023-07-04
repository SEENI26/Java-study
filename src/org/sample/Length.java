package org.sample;

import java.util.Scanner;

 public class Length{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String r=s.nextLine();
		{
			System.out.println("String length is:" +r.length());
		}
	}
}
package test;

import java.util.Scanner;

import sorting.Factorial;

public class TestFacotial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  the Number : ");
		int n = sc.nextInt();
		Factorial obj = new Factorial();
		int value = obj.Factorial(n);
		System.out.println("The Factorial of "+n+" is : "+value);
	}
}

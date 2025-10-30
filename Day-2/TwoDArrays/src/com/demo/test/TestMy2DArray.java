package com.demo.test;

import com.demo.Arrays.My2DArray;

public class TestMy2DArray {

	public static void main(String[] args) {
		My2DArray obj = new My2DArray();
		obj.acceptData();
		obj.displayData();
		int[][] arr=obj.transpose();
		displayarray(arr);
		System.out.println("--------------");

		int[] rowSums = obj.findSumRowWise();
		for (int i = 0; i < rowSums.length; i++) {
            System.out.println("Sum of Row " + (i + 1) + ": " + rowSums[i]);
		}
		System.out.println("--------------");
		int[] colSums = obj.findSumColwise();
		for (int i = 0; i < rowSums.length; i++) {
            System.out.println("Sum of Col " + (i + 1) + ": " + colSums[i]);
		}
		System.out.println("-----------------\r\n");

		int[][] arr1 = obj.add2Arrays(obj);
		if(arr1!=null) {
			displayarray(arr1);
		}
		else {
			System.out.println("dimesnsions does not match");
		}
		
		System.out.println("-----------------\r\n"
				+ "");
		int[][] arr2 = obj.subtract2Arrays(obj);
		if(arr2!=null) {
			displayarray(arr2);
		}
		else {
			System.out.println("dimesnsions does not match");
		}
		System.out.println("-----------------\r\n"
				+ "");
		obj.rowRotate(true,1);
		obj.displayData();
		obj.rowRotate(false,1);
		obj.displayData();
		
		System.out.println("-----------------\r\n"
				+ "");
		obj.colRotate(true,2);
		obj.displayData();
		obj.colRotate(false,1);
		obj.displayData();
		
		System.out.println("-----------------\r\n"
				+ "");
		if(obj.isSymmetric()) {
			System.out.println("not symmetric matrix");
		}
		else {
			System.out.println(" symmetric matrix");
		}
		
		System.out.println("-----------------\r\n"
				+ "");
		if(obj.isIdentity()) {
			System.out.println("not Identity matrix");
		}
		else {
			System.out.println(" Identity matrix");
		}
		
		
	}
	
	private static void displayarray(int[][] arr) {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					System.out.print(arr[i][j]+"\t");
				}
				System.out.println();
			}
	}

}

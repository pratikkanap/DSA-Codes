package com.demo.Arrays;

import java.util.Scanner;

public class My2DArray {
	private int[][] arr;

	public My2DArray() {
		arr = new int[3][3];
	}
	public My2DArray(int rows, int col) {
		arr = new int[rows][col];
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j <arr[0].length;j++) {
				System.out.println("Enter the values : "+" i => "+i+" AND "+"j => "+j);
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("-----------------");
	}
	public void displayData() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("-----------------");
	}
	public int[][] transpose(){
		int[][] temp = new int[arr[0].length][arr.length];
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[0].length;j++) {
				temp[j][i] = arr[i][j];
			}
		}
		return temp;
	}
	public int[] findSumRowWise() {
		int[] sumrows = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sumrows[i] += arr[i][j];
			}
		}
		return sumrows;
	}
	public int[] findSumColwise() {
		int[] colrows = new int[arr[0].length];
		for(int i=0;i<arr[0].length;i++) {
			for(int j=0;j<arr.length;j++) {
				colrows[i] += arr[j][i]; 
			}
		}
		return colrows;
	}
	public int[][] add2Arrays(My2DArray obj){
		if(this.arr.length== obj.arr.length && this.arr[0].length==obj.arr[0].length) {
		int[][] temp = new int[arr.length][arr[0].length];
		for(int i=0;i<this.arr.length;i++) {
			for(int j=0;j<this.arr[0].length;j++) {
				temp[i][j] = this.arr[i][j] + obj.arr[i][j];
				}
			}
			return temp;
		}
		return null;
	}
	public int[][] subtract2Arrays(My2DArray obj) {
		if(this.arr.length== obj.arr.length && this.arr[0].length==obj.arr[0].length) {
			int[][] temp = new int[arr.length][arr[0].length];
			for(int i=0;i<this.arr.length;i++) {
				for(int j=0;j<this.arr[0].length;j++) {
					temp[i][j] = this.arr[i][j] - obj.arr[i][j];
					}
				}
				return temp;
			}
			return null;
		}
	public void rowRotate(boolean flag, int num) {
		if(flag) {
			for(int cnt=0;cnt<num;cnt++) {
				int[] temp = arr[0];
			for(int i=0;i<arr.length-1;i++) {
				arr[i] = arr[i+1];
			}
			arr[arr.length-1] = temp;
		}
	}else {
		for(int cnt=0;cnt<num;cnt++) {
			int[] temp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
	}
		
	}
		
	}
	public void colRotate(boolean flag, int num) {
		if(flag) {
			for(int cnt=0;cnt<num;cnt++) {
				int[] temp=new int[arr.length];
				for(int i=0;i<arr.length;i++) {
					temp[i]=arr[i][arr[0].length-1];
				}
				for(int i=0;i<arr.length;i++) {
					for(int j=arr[0].length-2;j>=0;j--) {
						arr[i][j+1]=arr[i][j];
					}
				}
				for(int i=0;i<arr.length;i++) {
					arr[i][0]=temp[i];
				}
			}	
		}
		else {
			for(int cnt=0;cnt<num;cnt++) {
				
				int[] temp=new int[arr.length];
				for(int i=0;i<arr.length;i++) {
					temp[i]=arr[i][0];
				}
				for(int i=0;i<arr.length;i++) {
					for(int j=1;j<arr[0].length;j++) {
						arr[i][j-1]=arr[i][j];
					}
				}	
				for(int i=0;i<arr.length;i++) {
					arr[i][arr[0].length-1]=temp[i];
				}
			}	
		}
	}
	
	public boolean isSymmetric() {
		if(arr.length==arr[0].length) {
			for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]!=arr[j][i]) 
					return false;
				}
			}
			return true;
		}
		return false;
	}
	public boolean isIdentity() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j && arr[i][j]!=1) {
					return false;
				}
				else if(i!=j && arr[i][j]!=0) {
					return false;
				}
			}
		}
		return true;
	}
}

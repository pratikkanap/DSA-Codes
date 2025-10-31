package com.demo.test;

import java.util.Scanner;

import com.demo.search.SearchingService;

public class TestSearch {

	

	public static void main(String[] args) {
		//int[] arr = {10,5,4,7,8,3,2,15};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter Array elements :");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
		System.out.println("--------LINEAR SEARCH--------");
        System.out.print("Enter the number to search : ");
        int searchElement = sc.nextInt();	
		
		int position = SearchingService.linearSearch(arr, searchElement);
		
		if(position != -1) {
			System.out.println("The number found at Position : "+position);
		}else{
			System.out.println("NOT FOUND..");
		}
		
		System.out.println("--------BINARY SEARCH--------");
        System.out.print("Enter the number to search : ");
	    searchElement = sc.nextInt();	
	        
		int pos = SearchingService.binarySearch(arr, searchElement);
			if(pos!=-1) {
				System.out.println("binary search number found at position : "+pos);
			}else {
				System.out.println("binary search number not found");
			}
			System.out.println("--------BINARY SEARCH RECURSSIVE--------");

			int low = arr[0];
			int high = arr.length - 1;
			System.out.print("Enter the number to search : ");
			searchElement = sc.nextInt();	
			pos=SearchingService.binarySearchRecurssive(arr,searchElement,low,high);
			if(pos!=-1) {
				System.out.println("binary search number found at position : "+pos);
			}else {
				System.out.println("binary search number not found");
			}
			sc.close();
		
	}

}

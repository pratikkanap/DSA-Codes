package com.demo.search;

public class SearchingService {
	public static int linearSearch(int[] arr,int search) {
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == search) {
				return i;
			}
			
		}
		return -1;
		
	}
	public static int binarySearch(int[] arr1,int search) {
		int low = 0;
		int high = arr1.length - 1;
		int count = 0;
		while(low<=high) {
			int mid =  (low + high)/2;
			count++;
			if(arr1[mid] == search) {
				return mid;
		}
		else if(search<arr1[mid]) {
			high = mid - 1;
		}else {
			low = mid +  1;
		}
		
	}
		System.out.println("comparisons are : "+count);
		return -1;
	}
	
	public static int binarySearchRecurssive(int[] arr, int search,int low,int high ) {
		//System.out.println("binary search called "+low+"-----"+high);
		if(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==search) {
				return mid;
			}else if(search<arr[mid]) {
				return binarySearchRecurssive(arr,search,low,mid-1);
			}else {
				return binarySearchRecurssive(arr,search,mid+1,high);
			}
		}
		return -1;
	}
}
package sorting;

import java.util.Arrays;

public class BubbleSorting {
	public static void bubbleSort(int[] arr) {
		for(int i =0 ; i < arr.length;i++) {
			for(int j = 1;j<arr.length - i;j++) {
				if(arr[j - 1]>arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println("Iteration: "+i);
			System.out.println(Arrays.toString(arr));
		}		
	}
	public static void bubbleSortingImproved(int[] arr) {
		boolean flag = false;
		for(int i = 0;i<arr.length;i++) {
			for(int j = 1;j<arr.length;j++) {
				if(arr[j-1] > arr[j]) {
					flag = true;
					int temp = arr[j-1];
					arr[j-1] =arr[j];
					arr[j] = temp;
					
				}
			}
				System.out.println("Iteration: "+i);
				System.out.println(Arrays.toString(arr));
				if(!flag) {
					break;
			}
		}
	}
		public static void bubbleSortDecending(int[] arr) {
			for(int i = 0;i<arr.length;i++) {
				boolean flag =  false;
				for(int j = 1;j<arr.length;j++) {
					if(arr[i] > arr[j-1]) {
						flag = true;
						int temp = arr[j-1];
						arr[j -1] = arr[j];
						arr[j] = temp;
					}
				}
				System.out.println("Iteration: "+i);
				System.out.println(Arrays.toString(arr));
				if(!flag)
					break;
			}
	}
}

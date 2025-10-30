package com.demo.test;

import java.util.stream.IntStream;

import com.demo.arrays.MyArray;
public class TestArray {
	public static void main(String[] args) {
		MyArray obj = new MyArray(7);
		
		
		
		obj.addValue(10); 
		obj.addValue(20);
		obj.addValue(12);
		obj.addValue(30);
		obj.addValue(80,1);
		
		System.out.println(obj);
		
		System.out.println("The Capacity of An Array is : "+obj.getCapacity());
		
		System.out.println("The Size of An Array is : "+obj.getSize());
				
		System.out.println("The value which is to be search is : "+obj.searchByValue(12));
		
		System.out.println("Is the value delete : "+obj.deleteByValue(30));
		
		System.out.println("The Max value is : "+obj.findMax());
		
		System.out.println("The sum of all Array Values are : "+obj.findSum());
		
		int[] arr1=obj.reverseArray(true);
		System.out.println("Reverse value is : ");
		IntStream.of(arr1).forEach(e->System.out.print(e+","));
		
//		
//	    int[] arr2=obj.exchangeIndexValue();
//		System.out.println("Rotate the Array : ");
//		IntStream.of(arr2).forEach(e->System.out.print(e+","));
//		
	}

}

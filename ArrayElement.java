package com.aman;

public class ArrayElement {
	public static void main(String[]args) {
		// Create an array
		int arr[]=new int[100];
		
		// Initialize the array with values from 1 to 100
		for(int i=0; i<100; i++) {
			arr[i]=i+1;
		}
		// print array element
		for(int i=0; i<arr.length; i++) {
			System.out.println("Element index:-"+i+" "+arr[i]);
		}
	}

}

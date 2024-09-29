package com.lmsDay5;

public class ArrayOutOfBoundDemo {
	
	
	    public static void main(String[] args) {
	        // Create an array 
	    	
	        int[] array = new int[10];

	        try {
	        	
	            // Intentionally access an index out of bounds
	            // The valid indices for this array are 0 to 9
	            System.out.println(array[10]); // This will throw ArrayIndexOutOfBoundsException
	        } catch (ArrayIndexOutOfBoundsException e) {
	        	
	            // Catch the exception and print an error message
	            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
	        }
	    }
	}




package com.dgmf.bnonprimitivedatatypes;

public class NonPrimitiveDatatypes {

	public static void main(String[] args) {
		// String is going to reuse the same Object
		String str1 = "Test 1";
		System.out.println("The String 1 is : " + str1);
		
		// String is going to create a new Object
		String str2 = new String("Test 2");
		System.out.println("The String 2 is : " + str2);
		
		int[] array1; // Declaration // int array1[];
		array1 = new int[2]; // Assign a size (number of values is going to store)
		array1[0] = 0;
		array1[1] = 1;
		// array1[2] = 2; // Exception ==> "ArrayIndexOutOfBoundsException"
		
		System.out.println(array1); // It will print the reference of the array
		System.out.println(array1[0]);
	}

}

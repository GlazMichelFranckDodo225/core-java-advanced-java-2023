package com.dgmf.subject4datatypeconversion;

public class ExplicitDatatypeConversion {

	public static void main(String[] args) {
		/* Explicit Datatype Conversion (Casting) */
		// Store a larger range variable into a 
		// samller range variable
		double a = 50.50;
		System.out.println("Double representation : " + a);
		
		// float b = a; // Error ==> Type mismatch: cannot convert from double to float
		float b = (float) a; // Type Casting with the Cast operator
		System.out.println("Float representation : " + b);
		
		// long c = a; // Error ==> Type mismatch: cannot convert from double to long
		long c = (long) a; // Type Casting with the Cast operator
		System.out.println("Long representation : " + c);
		
		// int d = c; // Error ==> Type mismatch: cannot convert from long to int
		int d = (int) c; // Type Casting with the Cast operator
		System.out.println("Int representation : " + d);
	}

}

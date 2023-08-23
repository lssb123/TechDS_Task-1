/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Operations
{
	public static void operation(String operation, int a, int b){
		System.out.println(operation);
		System.out.println(a+b);
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int num1 = 1;
		int num2 = 2;
		String operation = "+";
		operation(operation,num2,num1);
	}
}

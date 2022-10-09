package Arrays;

import java.util.Scanner;

public class SumOfArray {
	
	public static int [] takeInput() {
		Scanner sc=new Scanner(System.in);
		//asking for size
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		// creating array
		int arr[]=new int [size];
		// taking input using loop
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	// creating function for printing output
	public static void output(int arr[]) {
		int size=arr.length;
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
	// function for summation of array
	public static int sumArray(int arr[]) {
		int size=arr.length;
		int sum=0;
		for(int i=0; i<size; i++) {
			sum=arr[i]+sum;
			
		}
		return sum;
	}
	
	public static void main(String args[]) {
		int arr1[]=takeInput();
		//output(arr1);
		int total=sumArray(arr1);
		System.out.println(total);
		
		
		
	}


}

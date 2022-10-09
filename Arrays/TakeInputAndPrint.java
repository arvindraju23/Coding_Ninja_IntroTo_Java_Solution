package Arrays;
import java.util.Scanner;
public class TakeInputAndPrint {
	/*
	    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		// asking user to enter the size;
		System.out.println("Enter size ");
		int size=sc.nextInt();
		//creating arr as array
		int arr[]=new int [size];
		//taking input using loop
		System.out.println("Enter the input: ");
		for(int i= 0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Elements of Array is: ");
		//Printing the output using loop
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
	
	*/
	
	// using function for taking input and printing output
	
	// for taking input;
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
	
	// Main function
	public static void main(String args[]) {
		//calling function
		int arr1[]=takeInput();
		output(arr1);
	}

	

}

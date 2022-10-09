package Arrays;
import java.util.*;
public class LargestElementInArray {
	public static int LargestElement(int input[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0; i<input.length; i++) {
			if(input[i]>max) {
				max=input[i];
			}
			
		}
		return max;
	}
	// taking input of array
	public static int [] takeInput() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		//creating array of size n
		int arr[]=new int [size];
		//taking input from user
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	//printing the array
	//making function for printing array
	public static void PrintArray(int arr[]) {
		int size=arr.length;
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calling function
		int output[]=takeInput();
		PrintArray(output);
		int Largest= LargestElement(output);
		System.out.println(Largest);

	}

}

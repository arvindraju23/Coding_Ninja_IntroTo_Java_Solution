import java.util.Scanner;
public class SimpleInterestCalculator {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		
		//String str= "abc";
		//String str=sc.nextLine();
		//String str= sc.next();
		//System.out.println(str);
		
		//char ch= str.charAt(0);
		//System.out.println(ch);
		
		System.out.println("Enter the principle , rate and time to calculate simple interest: ");
		int p=sc.nextInt();
		int r= sc.nextInt();
		int t=sc.nextInt();
		int Interest=(p*r*t)/100;
		System.out.println("Simple Interest is: " +Interest);
		
		
//		long l= sc.nextLong();
//		float ft= sc.nextFloat();
//		double d=sc.nextDouble();
//	
	}

}

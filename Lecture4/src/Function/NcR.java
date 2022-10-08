package Function;
import java.util.Scanner;

//USING FOR LOOP
//public class NcR {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc=new Scanner (System.in);
//		int n=sc.nextInt();
//		int r=sc.nextInt();
//		
//		int num=1;
//		for(int i=1; i<=n; i++) {
//			num=num*i;
//		}
//		int den1=1;
//		for(int i=1; i<=r; i++) {
//			den1=den1*i;
//		}
//		int den2=1;
//		for(int i=1; i<=n-r; i++) {
//			den2=den2*i;
//		}
//		
//		int ans= num/((den1)*(den2));
//		System.out.println(ans);
//
//	}
//
//}

//USING FUNCTION 

public class NcR{
	public static int Factorial(int n) {
		int ans=1;
		for(int i=1; i<=n; i++) {
			ans= ans*i;
		}
		return ans;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int r=sc.nextInt();
		int num=Factorial(n);
		int den1=Factorial(r);
		int den2=Factorial(n-r);
		
		int ans=num/(den1*den2);
		System.out.println(ans);
		
	}
}

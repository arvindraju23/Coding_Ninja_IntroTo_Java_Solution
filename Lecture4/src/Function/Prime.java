package Function;
import java.util.Scanner;
public class Prime {
	public static boolean isPrime(int n) {
		int d=2;
		while(d<n) {
			if(n%d==0) {
				return false;
			}
			d++;
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean ansPrime=isPrime(n);
		System.out.println(ansPrime);

	}
	
}


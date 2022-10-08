package for_loop;
import java.util.Scanner;
public class sumTillN {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		//USING WHILE LOOP
//		int i=1;
//		int sum=0;
//		while(i<=n) {
//			sum=sum+i;
//			i++;
//		}
//		System.out.println(sum);
		
		
		// using FOR Loop
		int sum=0;
		for(int i=1; i<=n; i++) {
			sum=sum+i;
		      
		}
		System.out.println(sum);
		
		
		
	}

}

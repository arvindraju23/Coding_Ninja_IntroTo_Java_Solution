package while_loop;
import java.util.Scanner;
public class prime {
	public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
		int d=2;
	    int n=sc.nextInt();
		while(d<=n -1) {
			if(n%d ==0) {
				System.out.println("Not prime");
				return;
			}
			d=d+1;
		}
		System.out.println("Prime");
	   
	}

}

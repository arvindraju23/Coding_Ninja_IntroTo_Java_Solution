package if_else;
import java.util.Scanner;
public class LargestOf3Nos {
	public static void main(String args []) {
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		
		if((a>=b) && (a>= c)){
			System.out.println(a);
			
		}
		else if((b>=c) &&(b>=a)) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
	}

}

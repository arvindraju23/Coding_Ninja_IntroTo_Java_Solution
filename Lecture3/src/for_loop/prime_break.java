package for_loop;

import java.util.*;
public class prime_break {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=2;
		boolean divided=false;
		while(d<n) {
			if(n%d==0) {
				divided=true;
				break;
			}
			d++;
		}
		if(divided) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
		}
	}

}

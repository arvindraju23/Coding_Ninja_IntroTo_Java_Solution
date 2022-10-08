import java.util.*;
public class SumNnos {
	public static void main(String args) {
		Scanner sc= new Scanner(System.in);
		int i=1;
		int sum=0;
		int n=sc.nextInt();
		while(i<n) {
			sum=sum+i;
			i=i+1;
		}
		System.out.println(sum);
	}

}

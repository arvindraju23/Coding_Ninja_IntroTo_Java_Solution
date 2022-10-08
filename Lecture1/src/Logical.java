import java.util.Scanner;
public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		int y =sc.nextInt();
		int z= sc.nextInt();
		
		boolean isLargest = (x>=y ) && (x>=z);
		System.out.println(isLargest);
		

	}

}

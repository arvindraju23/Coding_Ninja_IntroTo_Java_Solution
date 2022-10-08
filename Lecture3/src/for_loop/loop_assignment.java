package for_loop;
import java.util.Scanner;
public class loop_assignment {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
//		for(int i = 0; i < 5; i = i + 1){
//		    System.out.print(i + " ");
//		    i = i + 1;
//		}
//		
//		  for(int i=483;i>0;i=i%3)
//		    {
//		        System.out.println("*");
//		    }
		
		int i = 1;
		while(i < 3) {
		    int j = 0;
		    while(j < 5) {
		        j++;
		        if(j == 3) {
		            continue;
		        }
		        System.out.print(j + " ");
		    }
		    i++;
		}
	}

}

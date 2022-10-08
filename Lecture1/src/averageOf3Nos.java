

import java.util.Scanner;
public class averageOf3Nos {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        
        Scanner scan= new Scanner (System.in);
        String str=scan.next();
        int m1= scan.nextInt();
        int m2= scan.nextInt();
        int m3= scan.nextInt();
        int average =(m1+m2+m3)/3;
        
        System.out.println(str.charAt(0));
        System.out.println(average);
        

		
	}

}

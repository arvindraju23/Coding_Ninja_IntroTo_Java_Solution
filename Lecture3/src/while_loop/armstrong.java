package while_loop;

import java.util.Scanner;  
import java.lang.Math;  
public class armstrong
{  
   
    static boolean isArmstrong(int num)   
    {   
        int temp, digits=0, last=0, sum=0;   
        temp = num;   
        while(temp > 0)    
        {   
            temp = temp/10;   
            digits++;   
        } 
        temp = num;   
        while(temp > 0)   
        {   
            last = temp % 10;   
            sum +=  (Math.pow(last, digits));   
            temp = temp/10;   
        }  
        if(num == sum)   
            return true;      
        else 
            return false;
    }   
     
    public static void main(String args[])     
    {     
        int n;
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();  
        if ( isArmstrong(n) ) 
            System.out.println("true");
        else
            System.out.println("false");
    }
}


/* 
 * Name:- CHINMAY NAYAK
 * Reg no.:- 2341014097
 * PS link:-https://cses.fi/problemset/task/1070 
 */


import java.util.*;
public class Q5_1070 
{
    public static void main(String[] args) throws Exception 
    {
       Scanner sc = new Scanner(System.in);
       int n =sc.nextInt();
       if(n<4 && n!=1)
       {
         System.out.println("NO SOLUTION");
       }
       else
       {
        long i=1;
        long j=2;
        StringBuilder sb = new StringBuilder();
        while(j<=n)
        {
            sb.append(j).append(" ");
            j+=2;
        }
        while(i<=n)
        {
            sb.append(i).append(" ");
            i+=2;
        }
        System.out.println(sb);
       }
       
      


        
    }
    
}

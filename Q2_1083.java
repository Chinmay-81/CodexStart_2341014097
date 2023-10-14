
/* 
 * Name:- CHINMAY NAYAK
 * Reg no.:- 2341014097
 * PS link:-https://cses.fi/problemset/task/1083 
 */


import java.util.Scanner;
public class Q2_1083 
{
    public static long missing(long [] y,long x)
    {
        long sum = (x*(x+1))/2;
        

        for (int i = 0; i < y.length; i++)
        {
            sum = sum - y[i];   
        }
        
        return sum;

       
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        long[] y=new long[x];
        for(int i=0; i<x-1; i++)
        {
            y[i]=sc.nextLong();
        }
        
        System.out.println(missing(y, x));
    }
    
}

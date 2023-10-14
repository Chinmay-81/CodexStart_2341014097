
/* 
 * Name:- CHINMAY NAYAK
 * Reg no.:- 2341014097
 * PS link:-https://cses.fi/problemset/task/1618
 */


import java.util.*;
public class Q7_1618
{
    public static  void trailZero(long x)
    {
        int count=0;
        long pow=5;
        while ((x/pow)>0) 
        {
            count+=(x/pow);
            pow=pow*5;
            
        }
        System.out.println(count);

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        trailZero(x);
    }
    
}


/* 
 * Name:- CHINMAY NAYAK
 * Reg no.:- 2341014097
 * PS link:-https://cses.fi/problemset/task/1094
 */


import java.util.Scanner;
public class Q4_1094 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int[] ar =new int[n];
        for(int i=0; i<n; i++)
        {
            ar[i]=sc.nextInt();
        }

        long moves=0;
        
        for(int i=1; i<n; i++)
        {
            if(ar[i]<ar[i-1])
            {
                moves += (ar[i-1]-ar[i]);
                ar[i]=ar[i-1];
            }
        }
        System.out.println(moves);

        
    }
    
}

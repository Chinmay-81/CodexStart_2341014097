
/* 
 * Name:- CHINMAY NAYAK
 * Reg no.:- 2341014097
 * PS link:-https://cses.fi/problemset/task/1068 
 */

public class Q1_1068
{
    public static void weiredAlgo(long a)
    {
        
        while (a>1) 
        {
            System.out.print(a+" ");
            if (a%2==0) 
            {
                a=a/2;
            }else 
            {
                a=(a*3)+1;
            }
        }
        System.out.print(a);
       
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        long n=Integer.parseInt(sc.nextLine());
        weiredAlgo(n);

    }
    
}


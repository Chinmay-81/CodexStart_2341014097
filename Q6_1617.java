
/* 
 * Name:- CHINMAY NAYAK
 * Reg no.:- 2341014097
 * PS link:-https://cses.fi/problemset/task/1617
 */


import java.util.Scanner;
public class Q6_1617 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long MOD = 1000000007; 

        long result = countBitStrings(n, MOD);

        System.out.println(result);
    }

    public static long countBitStrings(int n, long mod) {
        if (n == 0) 
        {
            return 1; 
        } 
        else 
        {
            long power = 2;
            long result = 1;

            while (n > 0) 
            {
                if (n % 2 == 1) 
                {
                    result = (result * power) % mod;
                }
                power = (power * power) % mod;
                n /= 2;
            }

            return result;
        }
    }
}

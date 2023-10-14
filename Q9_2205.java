
/* 
 * Name:- CHINMAY NAYAK
 * Reg no.:- 2341014097
 * PS link:-https://cses.fi/problemset/task/2205
 */


import java.util.*;
public class Q9_2205
{
    public static ArrayList<String> getcode(int n)
    {
        if(n==1)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("0");
            base.add("1");
            return base;
        }
        ArrayList<String> result = getcode(n-1);
        ArrayList<String> myAr =new ArrayList<>();
        for(int i=0; i<result.size(); i++)
        {
            myAr.add("0"+result.get(i));
        }
        for(int i=result.size()-1; i>=0; i--)
        {
            myAr.add("1"+result.get(i));
        }
        return myAr;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        ArrayList<String> ans =getcode(n);
        for(int i=0; i<ans.size(); i++)
        {
            System.out.println(ans.get(i));
        }       
    }  
}

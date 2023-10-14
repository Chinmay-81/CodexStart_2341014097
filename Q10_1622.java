
/* 
 * Name:- CHINMAY NAYAK
 * Reg no.:- 2341014097
 * PS link:-https://cses.fi/problemset/task/1622
 */


import java.util.*;
public class Q10_1622 
{
    public static void Createstr(char[] ar, int fi, TreeSet<String> sortedstr) 
    {
        if (fi == ar.length - 1) 
        {
            sortedstr.add(new String(ar));
            return;
        }

        Set<Character> detect = new HashSet<>();

        for (int i = fi; i < ar.length; i++) 
        {
            if (!detect.contains(ar[i])) 
            {
                swap(ar, i, fi);
                Createstr(ar, fi + 1, sortedstr);
                swap(ar, i, fi);
                detect.add(ar[i]);
            }
        }
    }
    public static void swap(char[] ar, int i, int fi) 
    {
        char temp = ar[fi];
        ar[fi] = ar[i];
        ar[i] = temp;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        TreeSet<String> sortedstr = new TreeSet<>();
        Createstr(s.toCharArray(), 0, sortedstr);

        System.out.println(sortedstr.size());

        for (String x : sortedstr) 
        {
            System.out.println(x);
        }
    }
}

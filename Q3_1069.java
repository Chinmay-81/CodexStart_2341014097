
/* 
 * Name:- CHINMAY NAYAK
 * Reg no.:- 2341014097
 * PS link:-https://cses.fi/problemset/task/1069
 */


import java.io.*;
public class Q3_1069 
{
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader =new InputStreamReader(System.in);        
        BufferedReader br = new BufferedReader(inputStreamReader);
        String str =br.readLine();    
        String [] x=str.split("");
        int c =1;
        int max =1;
        for(int i=1; i<x.length; i++)
        {
            if(x[i].equals(x[i-1]))
            {
                c++;
                max=Math.max(max, c);
            }
            else
            {
                max=Math.max(max,c);
                c=1;
            }
        }
        System.out.println(max);

        
            

    }
        



        


}
    


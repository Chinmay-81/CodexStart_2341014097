
/* 
 * Name:- CHINMAY NAYAK
 * Reg no.:- 2341014097
 * PS link:-https://cses.fi/problemset/task/1754
 */


import java.io.*;
public class Q8_1754 
{
    public static String coin(int a, int b) 
    {
        if ((a + b) % 3 == 0 && 2 * Math.min(a, b) >= Math.max(a, b)) {
            return "YES";
        } else {
            return "NO";
        }
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
         for(int i=0; i<t; i++)
         {
            String[] input =br.readLine().split(" ");
            int a= Integer.parseInt(input[0]);
            int b= Integer.parseInt(input[1]);
            String result =coin(a, b);
            bw.write(result + "\n");
  
        }
        bw.flush();
        br.close();
        bw.close();
        
    }
    

    
}



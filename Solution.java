import java.util.*;
import java.io.*;
import java.lang.Math.*;



class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int S[][];
        S=new int[t][];
        //int n;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            S[i]=new int[n+1];
            S[i][1]=a+b;
            System.out.print(S[i][1]+" ");
            for(int j=2;j<=n;j++)
            {
                S[i][j]=S[i][j-1]+(int)(Math.pow(2,j-1))*b;
                System.out.print(S[i][j]+" ");
            }
        }
        /*for(int i=0;i<t;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(S[i][j]);
            }
        }*/
        in.close();
    }
}


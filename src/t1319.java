import java.io.*;
import java.util.*;

public class t1319 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[][] mas = new int[n][n];
        int k = (n+1)*n/2;
        int a=0, b=0;
        for (int i=1;i<=k;i++) {
            mas[a][b] = i;
            if (b==0){
                b=a+1;
                a=0;
            }
            else{
                a=a+1;
                b=b-1;
            }
        }

        a=n-1;
        b=n-1;
        for (int i=n*n;i>k;i--) {
            mas[a][b] = i;
            if (b==n-1){
                b=a-1;
                a=n-1;
            }
            else{
                a=a-1;
                b=b+1;
            }
        }


        for (int l=0; l<n; l++){
            for(int m=n-1; m>=0; m--){
                out.print(mas[l][m] + " ");
            }
            out.println("");
        }

        out.flush();
    }
}

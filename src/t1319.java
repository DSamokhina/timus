import java.io.*;
import java.util.*;

public class t1319 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[] mas = new int[n];
        int dop=1, t=1;
        ArrayList<int[]> allArrays = new ArrayList<int[]>();


        for (int j=1;j<=n;j++) {

            if (j>1){
                t = mas[n-2]+1;
            }
            int p=j-1;
            for (int i = dop; i < n+dop; i++) {
                if (i>dop) {
                    t = t+p;
                }
                mas[n + dop - i-1] = t;
                p=p+1;

            }
            dop=dop+1;
            allArrays.add(mas);

        }
        out.flush();
    }
}

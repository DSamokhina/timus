import java.io.*;
import java.util.*;

public class t1820 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int k = in.nextInt();
        int rez = 2;

        if (n>k){
            if (n % k == 0) {
                rez = 2*n;
            }
            else{
                if (n % k > k / 2) {
                    rez = (n/k+1)*2;
                }
                else {
                    rez = (n/k-1)*2+3;
                }
            }
        }
        out.println(rez);
        out.flush();
    }
}

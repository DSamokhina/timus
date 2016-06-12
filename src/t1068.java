import java.io.*;
import java.util.*;

public class t1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int sum=0;
        if (n<0) {
            for(int i=n; i<=1; i++){
                sum=sum+i;
            }
        }
        else if (n==0){
            sum=1;
        }
        else{
            for(int i=1; i<=n; i++){
                sum=sum+i;
            }
        }

        out.println(sum);
        out.flush();
    }
}

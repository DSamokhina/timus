import java.io.*;
import java.util.*;

public class t1924 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        if (sum==1 || sum==2 || sum%2==1){
            out.println("grimy");
        }
        else{
            out.println("black");
        }
        out.flush();
    }
}

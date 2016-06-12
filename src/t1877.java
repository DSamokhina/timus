
import java.io.*;
import java.util.*;

public class t1877 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        String result;
        if ((a%2)==0 || (b%2) == 1 || b==1 ) {
           result ="yes";
        }
        else result = "no";

        out.println(result);
        out.flush();

    }
}

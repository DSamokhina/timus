
import java.io.*;
import java.util.*;

public class t2012 {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String result = "NO";
        int f = in.nextInt();
        if (4*60>=(12-f)*45) {
            result = "YES";
        }
       out.println(result);
       out.flush();
    }
}

import java.io.*;
import java.util.*;

public class t1639 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int m = in.nextInt();
        int n = in.nextInt();
        if (n*m%2==0){
            out.println("[:=[first]");
        }
        else{
            out.println("[second]=:]");
        }

        out.flush();
    }
}

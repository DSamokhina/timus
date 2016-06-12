
import java.io.*;
import java.util.*;

public class t1293 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

       // System.out.println("Insert panels cont");
        int n = in.nextInt();
      //  System.out.println("Insert length");
        int a = in.nextInt();
      //  System.out.println("Insert width");
        int b = in.nextInt();

        int time = a*b*2*n;
        out.println(time);


        out.flush();

    }

}

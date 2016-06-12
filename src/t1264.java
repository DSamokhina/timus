import java.io.*;
import java.util.*;

import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Scanner;

public class t1264 {
    public static void main (String[] args){
       Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int m = in.nextInt()+1;
        out.print(n*m);
        out.flush();
    }
}

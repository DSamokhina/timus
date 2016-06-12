import java.io.*;
import java.util.*;

public class t2001 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        ArrayList<Integer> arrA = new ArrayList<Integer>();
        ArrayList<Integer> arrB = new ArrayList<Integer>();
        int i=0;
        while (in.hasNextInt()){
        if ((i%2==0)||(i==0)) {
                arrA.add(in.nextInt());
            }
            else{
                arrB.add(in.nextInt());
            }
            i++;
        }
        int y1 = arrA.get(0)-arrA.get(2);
        int y2 = arrB.get(0)-arrB.get(1);
        out.print(y1);
        out.print(" ");
        out.print(y2);
        out.flush();
    }
}

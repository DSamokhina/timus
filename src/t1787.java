import java.io.*;
import java.util.*;

public class t1787 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int k = in.nextInt();
        int n = in.nextInt();
      //  ArrayList<Integer> myArrList = new ArrayList<Integer>();
        int ost = 0;
        while (in.hasNextInt()) {
          //  myArrList.add(in.nextInt());
            ost = ost+in.nextInt()-k;
            if (ost<0){
                ost=0;
            }
        }
        out.println(ost);
        out.flush();
    }
}

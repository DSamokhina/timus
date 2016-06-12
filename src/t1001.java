import java.io.*;
import java.util.*;

public class t1001 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        ArrayList<Long> myArrList = new ArrayList<Long>();

       // for (int i=0; i<4; i++) {
           while (in.hasNext()) {

                myArrList.add(in.nextLong());

            }

        for (int i=myArrList.size()-1; i >=0 ; i--) {
            String sqrt = String.format("%.4f", Math.sqrt(myArrList.get(i)));
            out.println(sqrt);
        }
        out.flush();
    }
}

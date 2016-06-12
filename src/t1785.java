import java.io.*;
import java.util.*;

public class t1785 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);


     //   String s = in.nextLine();
       // String[] test = s.trim().split("\\s+");
//        for (int i = 0; i < test.length; i++) {
  //         out.println(test[i]);}

        String s;
        int count  = in.nextInt();
        if (count>=1 & count<=2000) {
            if (count<=4)
                s = "few";
            else if (count<=9)
                s = "several";
            else if (count<=19)
                s = "pack";
            else if (count<=49)
                s = "lots";
            else if (count<=99)
                s = "horde";
            else if (count<=249)
                s = "throng";
            else if (count<=499)
                s = "swarm";
            else if (count<=999)
                s = "zounds";
            else
                s = "legion";
            out.println(s);}



        out.flush();
    }

}

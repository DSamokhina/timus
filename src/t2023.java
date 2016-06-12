import java.io.*;
import java.util.*;

public class t2023 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        Map<String, Integer> hm = new HashMap<String, Integer>();

        hm.put("A", 0);
        hm.put("P", 0);
        hm.put("O", 0);
        hm.put("R", 0);

        hm.put("B", 1);
        hm.put("M", 1);
        hm.put("S", 1);

        hm.put("D", 2);
        hm.put("J", 2);
        hm.put("G", 2);
        hm.put("K", 2);
        hm.put("T", 2);
        hm.put("W", 2);

        int n = in.nextInt();
        int step = 0, laststep=0;
        String name;
        String s;
        int t;

        for (int i=0; i<n; i++){
            name = in.next();
            s =""+name.charAt(0);
            if (hm.containsKey(s)){
                t = hm.get(s);
                step = step+Math.abs(t-laststep);
                laststep = t;
            }
        }
        out.println(step);
        out.flush();
    }
}

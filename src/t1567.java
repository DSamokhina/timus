import java.io.*;
import java.util.*;

public class t1567 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        Map<String, Integer> hm = new HashMap<String, Integer>();

        hm.put("a", 1);
        hm.put("d", 1);
        hm.put("g", 1);
        hm.put("j", 1);
        hm.put("m", 1);
        hm.put("p", 1);
        hm.put("s", 1);
        hm.put("v", 1);
        hm.put("y", 1);
        hm.put(".", 1);
        hm.put("_", 1);

        hm.put("b", 2);
        hm.put("e", 2);
        hm.put("h", 2);
        hm.put("k", 2);
        hm.put("n", 2);
        hm.put("q", 2);
        hm.put("t", 2);
        hm.put("w", 2);
        hm.put("z", 2);
        hm.put(",", 2);

        hm.put("c", 3);
        hm.put("f", 3);
        hm.put("i", 3);
        hm.put("l", 3);
        hm.put("o", 3);
        hm.put("r", 3);
        hm.put("u", 3);
        hm.put("x", 3);
        hm.put("!", 3);

        String s;
        int t=0;

         //   while (in.hasNext()) {
                String name = in.nextLine();

                for (int i = 0; i < name.length(); i++) {
                    s = "" + name.charAt(i);
                    if (hm.containsKey(s)) {
                        t = t + hm.get(s);
                    } else if (s.equals(" ")) {
                        t = t + 1;
                    }
                    else {
                        break;
                    }
                }

//            }

        out.println(t);
        out.flush();
    }
}

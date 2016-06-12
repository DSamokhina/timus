import java.io.*;
import java.util.*;
import java.lang.String;

public class t1197 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            String s = in.next();
            char[] chars = s.toCharArray();
            char y =chars[0];
            char x = chars[1];
            if ((x == '1')||(x == '8')) {
                if ((y == 'h') || (y == 'a')) {
                    out.println(2);
                }
                else if ((y == 'b') || (y == 'g')){
                    out.println(3);
                }
                else {
                    out.println(4);
                }
            }
            else if ((x == '2')||(x == '7')) {
                if ((y == 'h') || (y == 'a')) {
                    out.println(3);
                }
                else if ((y == 'b') || (y == 'g')){
                    out.println(4);
                }
                else {
                    out.println(6);
                }
            }
            else{
                if ((y == 'h') || (y == 'a')) {
                    out.println(4);
                }
                else if ((y == 'b') || (y == 'g')){
                    out.println(6);
                }
                else {
                    out.println(8);
                }
            }
        }
        out.flush();
    }
}

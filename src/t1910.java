import java.io.*;
import java.util.*;

public class t1910 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        ArrayList<Integer> myArr = new ArrayList<Integer>();
        int max=0, st=0, t=0, imax=2;
        int n = in.nextInt();
        for(int i=0; i<3; i++){
            t = in.nextInt();
            myArr.add(t);
            max=max+t;
        }
        for(int j=3; j<n; j++){
            t = in.nextInt();
            myArr.add(t);
            st=t+myArr.get(j-1)+myArr.get(j-2);
            if (st>max){
                max=st;
                imax=j;
            }
        }
        out.print(max+" "+imax);
        out.flush();
    }
}

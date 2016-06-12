import java.io.*;
import java.util.*;

public class t1880 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        ArrayList<Integer> myArr1 = new ArrayList<Integer>();
        ArrayList<Integer> myArr2 = new ArrayList<Integer>();
        ArrayList<Integer> myArr3 = new ArrayList<Integer>();
        int m=0;

        int t1 = in.nextInt();
        int min = t1;
        for(int i=0;i<t1;i++){
            m = in.nextInt();
            myArr1.add(m);
        }

        int t2 = in.nextInt();
        if (t2<t1) {min = t2;}
        for(int i=0;i<t2;i++){
            m=in.nextInt();
            myArr2.add(m);
        }

        int t3 = in.nextInt();
        if (t3<min) {min = t3;}
        for(int i=0;i<t3;i++){
            m=in.nextInt();
            myArr3.add(m);
        }

        int res= 0;

        if (min==t1){
            res = rightNumber(myArr1,myArr2,myArr3);
        }
        else if (min==t2){
            res = rightNumber(myArr2,myArr1,myArr3);
        }
        else {
            res = rightNumber(myArr3,myArr2,myArr1);
        }

        out.println(res);
        out.flush();
    }

   public static int rightNumber(ArrayList<Integer> myArray, ArrayList<Integer> Arr2, ArrayList<Integer> Arr3) {
        int result = 0;
        for (int i = 0; i < myArray.size(); i++) {
            if (Arr2.indexOf(myArray.get(i))>=0 & Arr3.indexOf(myArray.get(i))>=0){
                result = result+1;
            }
        }
        return result;
    }

}

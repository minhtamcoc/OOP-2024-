import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ObjectInputStream o=new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> list=(ArrayList<Integer>) o.readObject();
        o.close();
        int[] a=new int[1005];
        for(Integer x:list){
            a[x]++;
        }
        for(int i=0;i<=1000;i++){
            if(a[i]>0){
                System.out.println(i+" "+a[i]);
            }
        }
    }
}
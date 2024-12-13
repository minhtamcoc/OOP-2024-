import java.util.*;
import java.io.*;
public class Main {
    public static boolean nto(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ObjectInputStream o=new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        List<Integer> list=(ArrayList<Integer>) o.readObject();
        o.close();
        int[] a=new int[10000];
        for(Integer x:list){
            if(nto(x)) a[x]++;
        }
        for(int i=0;i<10000;i++){
            if(a[i]>0){
                System.out.println(i+" "+a[i]);
            }
        }
    }
}
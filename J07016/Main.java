import java.util.*;
import java.io.*;
public class Main {
    public static boolean nto(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return n>1;
    }
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ObjectInputStream o1=new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> list1=(ArrayList<Integer>) o1.readObject();
        o1.close();
        ObjectInputStream o2=new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list2=(ArrayList<Integer>) o2.readObject();
        o2.close();
        int[] a=new int[10005];
        TreeMap<Integer,Integer> mp1=new TreeMap<>();
        TreeMap<Integer,Integer> mp2=new TreeMap<>();
        for(Integer x:list1){
            if(nto(x)){
            if(mp1.containsKey(x)) mp1.put(x,mp1.get(x)+1);
            else mp1.put(x,1);
            }
        }
        for(Integer x:list2){
            if(nto(x)){
            if(mp2.containsKey(x)) mp2.put(x,mp2.get(x)+1);
            else mp2.put(x,1);
            }
        }
        for(Integer x:mp1.keySet()){
            a[x]++;
        }   for(Integer x:mp2.keySet()){
            a[x]++;
        }
        for(int i=2;i<=10000;i++){
            if(a[i]==2){
                System.out.println(i+" "+mp1.get(i)+" "+mp2.get(i));
            }
        }
    }
}
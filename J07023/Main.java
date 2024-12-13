import java.util.*;
import java.io.*;
public class Main {
    public static boolean nto(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static boolean tn(int n) {
        String str = Integer.toString(n);
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    public static void main(String[] args) throws IOException,ClassNotFoundException{

        File f1=new File("DATA1.in");
        ObjectInputStream o1=new ObjectInputStream(new FileInputStream(f1));
        List<Integer> list1=(ArrayList<Integer>)o1.readObject();
        o1.close();
        File f2=new File("DATA2.in");
        ObjectInputStream o2=new ObjectInputStream(new FileInputStream(f2));
        List<Integer> list2=(ArrayList<Integer>)o2.readObject();
        o2.close();
        TreeMap<Integer,Integer> mp1=new TreeMap<>();
        TreeMap<Integer,Integer> mp2=new TreeMap<>();
        TreeMap<Integer,Integer> mp=new TreeMap<>();
        for(Integer x:list1){
            if(nto(x)&&tn(x)){
            if(mp1.containsKey(x)) mp1.put(x,mp1.get(x)+1);
            else mp1.put(x,1);
            }
            
        }
        for(Integer x:list2){
            if(nto(x)&&tn(x)){
            if(mp2.containsKey(x)) mp2.put(x,mp2.get(x)+1);
            else mp2.put(x,1);
            }
    }
        for(Integer x:mp1.keySet()){
            if(mp2.containsKey(x)){
                System.out.println(x+" "+mp1.get(x)+" "+mp2.get(x));
            }
        }
    }
}
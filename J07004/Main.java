import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File f=new File("DATA.in");
        Scanner sc=new Scanner(f);
        TreeMap<Integer,Integer> mp=new TreeMap<>();
        while(sc.hasNext()){
            int n=Integer.parseInt(sc.next());
            if(mp.containsKey(n)){
                mp.put(n,mp.get(n)+1);
            }
            else mp.put(n,1);
        }
        for(Integer x:mp.keySet()){
            System.out.println(x+" "+mp.get(x));
        }
    }
}
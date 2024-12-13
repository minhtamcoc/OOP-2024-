import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        TreeSet<String> st1=new TreeSet<>();
        TreeSet<String> st2=new TreeSet<>();
        File f1=new File("DATA1.in");
        Scanner sc=new Scanner(f1);
        while(sc.hasNextLine()){
            String s=sc.nextLine().trim().toLowerCase();
            String[] ss=s.split("\\s+");
            while(String x:ss){
                st1.add(x);
            }
        }
        sc.close();
        File f2=new File("DATA2.in");
        sc=new Scanner(f2);
        while(sc.hasNextLine()){
            String s=sc.nextLine().trim().toLowerCase();
            String[] ss=s.split("\\s+");
            while(String x:ss){
                st2.add(x);
            }
        }
        TreeMap<String,Integer> mp=new TreeMap<>();
        for(String x:st1){
            if(mp.containsKey(x)) mp.put(x,mp.get(x)+1);
            else mp.put(x,1);
        }
        for(String x:st2){
            if(mp.containsKey(x)) mp.put(x,mp.get(x)+1);
            else mp.put(x,1);
        }
        for(String x:mp.keySet()){
            System.out.print(x+" ");
        }
        System.out.println();
        for(String x:mp.keySet()){
            if(mp.get(x)==2){
                System.out.print(x+" ");
            }
        }
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static boolean check(String s){
        StringBuilder ss=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            char tmp=s.charAt(i);
            int x=tmp-48;
            if(x%2==0) return false;
        }
        if(s.length()%2==0||s.length()==1) return false;
        if(!s.equals(ss.reverse().toString())) return false;
        return true;
    }
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ObjectInputStream o=new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> list1=(ArrayList<Integer>) o.readObject();
        o.close();
        ObjectInputStream o1=new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list2=(ArrayList<Integer>) o1.readObject();
        o1.close();
        TreeMap<Integer,Integer> mp1=new TreeMap<>();
        TreeMap<Integer,Integer> mp2=new TreeMap<>();
        for(Integer x:list1){
            if(check(String.format("%d",x))){
                if(mp1.containsKey(x)) mp1.put(x,mp1.get(x)+1);
                else mp1.put(x,1);
            }
        }
        for(Integer x:list2){
            if(check(String.format("%d",x))){
                if(mp2.containsKey(x)) mp2.put(x,mp2.get(x)+1);
                else mp2.put(x,1);
            }
        }
        int idx=0;
        for(Integer x:mp1.keySet()){
            if(idx==10) break;
            if(mp2.containsKey(x)){
                int cnt=mp1.get(x)+mp2.get(x);
                System.out.println(x+" "+cnt);
                idx++;
            }
        }
    }
}
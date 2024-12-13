import java.util.*;
import java.io.*;
public class J07031 {
    public static boolean nto(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return n>=2;
    }
    public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException{
        ObjectInputStream o1=new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> list1=(ArrayList<Integer>)(o1.readObject());
        o1.close();
        ObjectInputStream o2=new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list2=(ArrayList<Integer>)(o2.readObject());
        o2.close();
        TreeSet<Integer> st1=new TreeSet<>();
        TreeSet<Integer> st2=new TreeSet<>();
        for(Integer x:list1){
            if(nto(x)) st1.add(x);
        }
        for(Integer x:list2){
            if(nto(x)) st2.add(x);
        }
        for(Integer x:st1){
            int m=1000000-x;
            if(x<m&&st1.contains(m)&&!st2.contains(x)&&!st2.contains(m)){
                System.out.println(x+" "+m);
            }
        }
    }
}

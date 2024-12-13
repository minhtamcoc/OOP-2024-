import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File f=new File("VANBAN.in");
        Scanner sc=new Scanner(f);
        TreeSet<String> st=new TreeSet<>();
        while(sc.hasNext()){
            String s=sc.next().toLowerCase();
            st.add(s);
        }
        for(String x:st){
            System.out.println(x);
        }
    }
}
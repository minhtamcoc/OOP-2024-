import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException,IOException ,ClassNotFoundException{
        ObjectInputStream o=new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        List<String> list=(ArrayList<String>)o.readObject();
        o.close();
        HashSet<String> st=new HashSet<>();
        for(String x:list){
            String[] ss=x.trim().toLowerCase().split("\\s+");
            st.addAll(Arrays.asList(ss));
        }
        File f=new File("VANBAN.in");
        Scanner sc=new Scanner(f);
        while(sc.hasNext()){
            String s=sc.next().toLowerCase();
            if(st.contains(s)){
                System.out.println(s);
                st.remove(s);
            }
        }
    }
}
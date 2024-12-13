import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
public class Main {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ObjectInputStream o=new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> list=(ArrayList<Pair>) o.readObject();
        o.close();
        Collections.sort(list);
       HashSet<String> st=new HashSet<>();
        for(Pair x:list){
            if(x.getFirst()<x.getSecond()&&!st.contains(x.toString())){
               st.add(x.toString());
               System.out.println(x);
            }
        }
    }
}
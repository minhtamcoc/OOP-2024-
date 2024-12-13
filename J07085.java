import java.util.*;
import java.io.*;
public class J07085 {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ObjectInputStream o=new ObjectInputStream(new FileInputStream("DATA.in"));
        List<String> list=(ArrayList<String>) o.readObject();
        o.close();
        for(String x:list){
            String tmp="";
            int sum=0;
            for(int i=0;i<x.length();i++){
                char k=x.charAt(i);
                if(Character.isDigit(k)){
                    tmp+=k;
                    sum+=k-48;
                }
            }
            int idx=0;
            while(idx<tmp.length()&&tmp.charAt(idx)=='0'){
                idx++;
            }
            for(int i=idx;i<tmp.length();i++){
                System.out.print(tmp.charAt(i));
            }
            System.out.println(" "+sum);
        }
    }
}
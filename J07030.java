import java.util.*;
import java.io.*;
public class J07030 {
    static int[] f=new int[1000001];
    public static void era(){
        Arrays.fill(f,1);
        f[0]=0;
        f[1]=0;
        for(int i=2;i<=1000;i++){
            if(f[i]==1){
                for(int j=i*i;j<=1000000;j+=i){
                    f[j]=0;
                }
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException{
        era();
        ObjectInputStream o1=new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> list1=(ArrayList<Integer>) o1.readObject();
        o1.close();
        ObjectInputStream o2=new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list2=(ArrayList<Integer>) o2.readObject();
        o2.close();
        TreeSet<Integer> st1=new TreeSet<>();
        TreeSet<Integer> st2=new TreeSet<>();
        for(Integer x:list1){
           if(f[x]==1) st1.add(x);
        }
        for(Integer x:list2){
          if(f[x]==1) st2.add(x);
        }
        for(Integer x:st1){
            if(x>=1000000-x) break;
            if(st2.contains(10000000-x)){
                System.out.println(x+" "+(1000000-x));
            }
        }
    }
}

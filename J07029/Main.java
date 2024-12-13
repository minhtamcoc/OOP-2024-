import java.util.*;
import java.io.*;
public class Main {
    static int[] f=new int[1000005];
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
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        era();
        ObjectInputStream o=new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> list=(ArrayList<Integer>) o.readObject();
        o.close();
        int[] a=new int[1000005];
        for(Integer x:list){
            a[x]+=f[x];
        }
        int idx=0;
        for(int i=1000000;i>=2;i--){
            if(a[i]>0){
                System.out.println(i+" "+a[i]);
                idx++;
                if(idx==10) break;
            }
        }
    }
}
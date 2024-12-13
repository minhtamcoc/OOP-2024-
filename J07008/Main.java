import java.util.*;
import java.io.*;
import java.lang.reflect.Field;
public class Main {
    static int n;
    static int[] a=new int[25];
    static int[] b=new int[25];
    static List<String> list=new ArrayList<>();
    public static boolean check(int n,int x[]){
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(x[i]==1){
                l.add(a[i]);
            }
        }
        for(int i=0;i<l.size()-1;i++){
            if(l.get(i)>l.get(i+1)) return false;
        }
        return true;
    }
    public static void Try(int i){
        for(int j=0;j<=1;j++){
                b[i]=j;
                if(i==n-1){
                    int cnt=0;
                   for(int l=0;l<n;l++){
                        if(b[l]==1) cnt++;
                   }
                   if(cnt>=2&&check(n,b)){
                    String tmp="";
                    for(int l=0;l<n;l++){
                       if(b[l]==1) tmp+=String.format("%d",a[l])+" ";
                    }
                    list.add(tmp.trim());
                   }
                }
                else Try(i+1);
        }
    }
    public static void main(String[] args) throws FileNotFoundException{
        File f=new File("DAYSO.in");
        Scanner sc=new Scanner(f);
            n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(sc.next());
        }
        Try(0);
        list.sort(new Comparator<String>() {
            public int compare(String x,String y){
                return x.compareTo(y);
            }
        });
        for(String x:list){
            System.out.println(x);
        }
    }
}
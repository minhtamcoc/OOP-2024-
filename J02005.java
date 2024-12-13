import java.security.Key;
import java.util.*;
public class J02005 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            s1.add(x);
        }
        for(int i=1;i<=m;i++){
            int x=sc.nextInt();
            s2.add(x);
        }
        TreeMap<Integer,Integer> mp=new TreeMap<>();
        for(Integer x:s1){
            if(mp.containsKey(x)){
                mp.put(x,mp.get(x)+1);
            }
            else{
                mp.put(x,1);
            }
        }
        for(Integer x:s2){
            if(mp.containsKey(x)){
                mp.put(x,mp.get(x)+1);
            }
            else{
                mp.put(x,1);
            }
        }
        for(Integer x:mp.keySet()){
            if(mp.get(x)>1){
                System.out.print(x+" ");
            }
        }
    }
}

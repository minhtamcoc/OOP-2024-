import java.util.*;
public class J02006 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        TreeMap<Integer,Integer> mp=new TreeMap<>();
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            if(mp.containsKey(x)){
                mp.put(x,mp.get(x)+1);
            }
            else mp.put(x,1);
        }
        for(int i=1;i<=m;i++){
            int x=sc.nextInt();
            if(mp.containsKey(x)){
                mp.put(x,mp.get(x)+1);
            }
            else mp.put(x,1);
        }
        for(int x:mp.keySet()){
            System.out.print(x+" ");
        }
    }
}

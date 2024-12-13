import java.util.*;
public class J08015 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            long[] a=new long[n];
            Map<Long,Integer> mp=new HashMap<>();
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
                if(mp.containsKey(a[i])){
                    mp.put(a[i],mp.get(a[i])+1);
                }
                else mp.put(a[i],1);
            }
            long cnt=0;
            for(int i=0;i<n;i++){
                if(mp.containsKey((long)k-a[i])){
                    cnt+=mp.get((long)k-a[i]);
                    if((long)k-a[i]==a[i]) cnt--;
                }
            }
            System.out.println(cnt/2);

        }
    }
}

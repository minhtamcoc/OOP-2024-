import java.util.*;
public class J01008 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int idx=0;
        while(t>0){
            idx++;
            long n=sc.nextLong();
            Map<Long,Long> mp=new HashMap<>();
            for(long i=2;i*i<=n;i++){
                if(n%i==0){
                    while(n%i==0){
                        if(mp.containsKey(i)){
                            mp.put(i,mp.get(i)+1);
                        }
                        else{
                            mp.put(i,1L);
                        }
                        n/=i;
                    }
                }
            }
            if(n>1) mp.put(n,1L);
            System.out.print("Test "+idx+": " );
        for(Long x:mp.keySet()){
            System.out.print(x+"("+mp.get(x)+")"+" ");
        }
        t--;
        System.out.println();
        }
    }
}

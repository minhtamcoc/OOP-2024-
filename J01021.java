import java.util.*;
public class J01021 {
    public static long mod=1000000007;
    public static long POW(long a,long b){
        if(b==0) return 1;
        long tmp=POW(a,b/2);
        if(b%2==0) return (tmp*tmp)%mod;
        return ((tmp*tmp)%mod*a)%mod;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            long a,b;
            a=sc.nextLong();
            b=sc.nextLong();
            if(a==0&&b==0) break;
            System.out.println(POW(a,b));
        }
    }
}

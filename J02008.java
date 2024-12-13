import java.util.*;
public class J02008 {
    public static long gcd(long a,long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextInt();
            long re=1L;
            for(long i=2;i<=n;i++){
                re=(re*i)/gcd(re,i);
            }
            System.out.println(re);
        }
    }
}

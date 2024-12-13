import java.util.*;
public class J01013 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long res=0;
        while(t-->0){
            int n=sc.nextInt();
            while(n%2==0){
                res+=2;
                n/=2;
            }
            for(int i=3;i*i<=n;i+=2){
                if(n%i==0){
                while(n%i==0){
                    res+=i;
                    n/=i;
                }
            }
            }
            if(n>1) res+=n;
        }
        System.out.println(res);
    }
}
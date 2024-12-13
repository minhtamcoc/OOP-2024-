import java.util.*;
public class J01014 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long n=sc.nextLong();
            long res=0;
            for(long i=2;i*i<=n;i++){
                if(n%i==0){
                    while(n%i==0){
                        if(res<=i){
                            res=i;
                        }
                        n/=i;
                    }
                }
            }
            if(n>1) res=n;
            System.out.println(res);
            t--;
        }
    }
}
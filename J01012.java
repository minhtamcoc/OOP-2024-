import java.util.*;
public class J01012 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int cnt=0;
            if(n%2==0) cnt=1;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    if(i%2==0) cnt++;
                    if((n/i)%2==0) cnt++;
                    if(i*i==n&&i%2==0) cnt--;
                }
            }
            System.out.println(cnt);
            t--;
        }
    }
}

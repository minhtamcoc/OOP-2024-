import java.util.*;
public class J02019 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[] res=new int[b+1];
        for(int i=2;i<=b;i++){
            for(int j=i*2;j<=b;j+=i){
                res[j]+=i;
            }
        }
        int cnt=0;
        for(int i=a;i<=b;i++){
            if(res[i]+1>i) cnt++;
        }
        System.out.println(cnt);
    }
}

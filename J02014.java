import java.util.*;
public class J02014 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n+1];
            int sum=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                sum+=a[i];
            }
            int res=0;
            int cnt=0;
            for(int i=0;i<n;i++){
                res+=a[i];
                if(res==(sum-res+a[i])){
                    System.out.println(i+1);
                    cnt++;
                    break;
                }
            }
            if(cnt==0) System.out.println("-1");
        }
    }
}

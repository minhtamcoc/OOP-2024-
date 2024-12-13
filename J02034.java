import java.util.*;
public class J02034 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[205];
        int[] b=new int[205];
        int Max=0;
        for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
          b[a[i]]++;
          if(a[i]>Max) Max=a[i];
        }
        int cnt=0;
        for(int i=1;i<=Max;i++){
            if(b[i]==0) {
                System.out.println(i);
                cnt++;
            }
        }
        if(cnt==0) System.out.println("Excellent!");
    }
}

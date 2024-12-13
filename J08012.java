import java.util.*;
public class J08012 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[100005];
        for(int i=1;i<=n-1;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            a[x]++;
            a[y]++;
        }
        int re1=0;
        int re2=0;
        for(int i=1;i<=100000;i++){
            if(a[i]>0){
                if(a[i]==n-1) re1++;
                else re2++;
            }
        }
        if(re1==1&&re2==n-1) System.out.println("Yes");
        else    System.out.println("No");
    }
}

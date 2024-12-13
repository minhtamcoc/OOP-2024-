import java.util.*;
public class J02009 {
    public static void Sort(int[] a,int n){
        for(int i=0;i<n-1;i++){
            int tmp=i;
            for(int j=i+1;j<n;j++){
                if(a[tmp]>a[j]){
                    tmp=j;
                }
            }
            int ans=a[i];
            a[i]=a[tmp];
            a[tmp]=ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int[] t=new int[105];
       int[] d=new int[105];
       for(int i=0;i<n;i++){
        t[i]=sc.nextInt();
        int y=sc.nextInt();
        d[t[i]]=y;
       }
       Sort(t,n);
       int tmp=t[0]+d[t[0]];
       for(int i=1;i<n;i++){
        if(tmp>t[i]) tmp+=d[t[i]];
        else tmp=t[i]+d[t[i]];
       }
       System.out.println(tmp);
    }
}

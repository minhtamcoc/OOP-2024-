import java.util.*;
public class J02024 { 
    static int[] a=new int[20];
    static int n;
    static int[] b=new int[20];
    public static void Sort(int a[],int n){
        for(int i=0;i<n-1;i++){
            int tmp=i;
            for(int j=i+1;j<n;j++){
                if(a[tmp]<a[j]){
                    tmp=j;
                }
            }
            int ans=a[i];
            a[i]=a[tmp];
            a[tmp]=ans;
        }
    }
    public static void Try(int i){
        for(int j=0;j<=1;j++){
            b[i]=j;
            if(i==n-1){
                int sum=0;
                for(int l=0;l<n;l++){
                    if(b[l]==1) sum+=a[l];
                }
                if(sum%2==1){
                    for(int l=0;l<n;l++){
                        if(b[l]==1) System.out.print(a[l]+" ");
                    }
                    System.out.println();
                }
            }
            else Try(i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
             n=sc.nextInt();
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Sort(a,n);
            Try(0);
        }
    }
}

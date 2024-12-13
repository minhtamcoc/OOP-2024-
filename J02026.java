import java.util.*;
public class J02026 {
    static int n,k;
    static Integer[] a=new Integer[20];
    static Integer[] b=new Integer[20];
    public static int check(int[] c,int k){
        for(int i=1;i<=k-1;i++){
            if(c[i]>c[i+1]) return 0;
        }
        return 1;
    }
    public static void Try(int i){
        for(int j=b[i-1]+1;j<=n-k+i;j++){
            b[i]=j;
            if(i==k){
                int[] c=new int[20];
                for(int l=1;l<=k;l++){
                    c[l]=a[b[l]];
                }
                if(check(c,k)==1){
                    for(int l=1;l<=k;l++){
                        System.out.print(c[l]+" ");
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
            b[0]=0;
            n=sc.nextInt();
            k=sc.nextInt();
            for(int i=1;i<=n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a,1,n+1,Comparator.naturalOrder());
            Try(1);
        }
    }
}

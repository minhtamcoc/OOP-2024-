import java.util.*;
public class J02025 {
    static Integer[] a=new Integer[20];
    static Integer[] b=new Integer[20];
    static int n;
    public static boolean nt(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void Try(int i){
        for(int j=0;j<=1;j++){
            b[i]=j;
            if(i==n-1){
                int sum=0;
                for(int l=0;l<n;l++){
                    if(b[l]==1) sum+=a[l];
                }
                if(nt(sum)){
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
            for(int i=0;i<n;i++) {
                a[i]=sc.nextInt();
            }
            Arrays.sort(a,0,n,Comparator.reverseOrder());
            Try(0);
        }   
    }
}

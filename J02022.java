import java.util.*;
public class J02022 {
    static int n;
    static int[] a=new int[15];
    static boolean[] visited=new boolean[15];
    public static void ins(){
        for(int i=1;i<=n;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
    public static int check(int[] x,int l){
        for(int i=1;i<l;i++){
           int tmp=a[i]-a[i+1];
            if(Math.abs(tmp)==1){
                return 0;
            }
        }
        return 1;
    }
    public static void Try(int i){
        for(int j=1;j<=n;j++){
            if(!visited[j]){
                visited[j]=true;
                a[i]=j;
                if(i==n){
                    if(check(a,n)==1) ins();
                }
                else Try(i+1);
                visited[j]=false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            n=sc.nextInt();
            Try(1);
        }
    }
}

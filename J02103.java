import java.util.*;
public class J02103 {
    public static int[][] chuyenvi(int[][] a,int n,int m){
        int[][] tmp=new int[m+1][n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                tmp[j][i]=a[i][j];
            }
        }
        return tmp;
    }
    public static int[][] tich(int[][] a,int[][]b,int n,int m){
        int[][] c=new int[n+1][n+1];
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                c[i][k]=0;
                for(int j=0;j<m;j++){
                    c[i][k]+=a[i][j]*b[j][k];
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int cnt=0;
        while(t-->0){
            cnt++;
            System.out.println("Test "+cnt+":");
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] a=new int[n+1][m+1];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j]=sc.nextInt();
                }
            }
            int[][] b=chuyenvi(a,n,m);
            int[][] c=tich(a,b,n,m);
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}

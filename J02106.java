import java.util.*;
public class J02106 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n+1][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            int re1=0;
            int re2=0;
            for(int j=0;j<3;j++){
                if(a[i][j]==1) re1++;
                else re2++;
            }
            if(re1>re2) cnt++;
        }
        System.out.println(cnt);
    }
}

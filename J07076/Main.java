import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File f=new File("MATRIX.in");
        Scanner sc=new Scanner(f);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            String[] ss=s.split("\\s+");
            int n=Integer.parseInt(ss[0]);
            int m=Integer.parseInt(ss[1]);
            int k=Integer.parseInt(ss[2]);
            k--;
            String re=sc.nextLine();
            String[] ss2=re.split("\\s+");
            int idx=0;
            int[][] a=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j]=Integer.parseInt(ss2[idx]);
                    idx++;
                }
            }
            for(int i=0;i<n;i++){
                int ans=i;
                for(int j=i+1;j<n;j++){
                    if(a[ans][k]>a[j][k]){
                        ans=j;
                    }
                }
                int tmp=a[i][k];
                a[i][k]=a[ans][k];
                a[ans][k]=tmp;
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
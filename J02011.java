import java.util.*;
public class J02011 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n+1];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int tmp=i;
            for(int j=i+1;j<n;j++){
                if(a[tmp]>a[j]){
                    tmp=j;
                }
            }
            int l=a[i];
            a[i]=a[tmp];
            a[tmp]=l;
            System.out.print("Buoc "+(i+1)+": ");
            for(int k=0;k<n;k++){
                System.out.print(a[k]+" ");
            }
            System.out.println();
        }
    }
}

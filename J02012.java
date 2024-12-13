import java.util.*;
public class J02012 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n+1];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0&&a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
            System.out.print("Buoc "+i+": ");
           for(int l=0;l<=i;l++) System.out.print(a[l]+" ");
           System.out.println();
        }
    }
}

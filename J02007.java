import java.util.*;
public class J02007 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=1;k<=t;k++){
            int n=sc.nextInt();
            TreeMap<Integer,Integer> mp=new TreeMap<>();
            int[] a=new int[10005];
            int[] b=new int[10005];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                b[a[i]]++;
            }
            System.out.println("Test "+k+":");
            for(int i=0;i<n;i++){
                if(b[a[i]]!=0){
                    System.out.println(a[i]+" xuat hien "+b[a[i]]+" lan");
                    b[a[i]]=0;
                }
            }
        }
    }
}

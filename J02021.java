import java.util.Scanner;

public class J02021 {
      static int idx=0;
    static int[] a=new int[15];
    static int n;
    static int k;
    public static void Try(int i){
        for(int j=a[i-1]+1;j<=n-k+i;j++){
            a[i]=j;
            if(i==k){
                idx++;
                for(int l=1;l<=k;l++){
                    System.out.print(a[l]);
                }
                System.out.print(" ");
            }
            else Try(i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         k=sc.nextInt();
        Try(1);
        System.out.println();
        System.out.println("Tong cong co "+idx+" to hop");
    }
}

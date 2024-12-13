import java.util.*;
public class J02035 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            boolean check=false;
            for(int i=0;i<n-1;i++){
                if((a[i]>a[i+1])){
                    System.out.println(i+1);
                    check=true;
                    break;
                }
            }
            if(!check) System.out.println(0);
         }
    }
}

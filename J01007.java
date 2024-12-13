import java.util.*;
public class J01007 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long[] F=new long[100];
            F[0]=0;
            F[1]=1;
            long n=sc.nextLong();
            if(n==0||n==1) System.out.println("YES");
            else{
            for(int i=2;i<=100;i++){
                F[i]=F[i-1]+F[i-2];
                if(F[i]==n){
                    System.out.println("YES");
                    break;
                }
                else if(F[i]>n){
                    System.out.println("NO");
                    break;
                }
            }
        }
            t--;
        }
    }
}

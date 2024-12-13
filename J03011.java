import java.util.*;
// GCD(A,B)=GCD(B,A%B);
public class J03011 {
    public static long Gcd(long a,long b){
        if(b==0) return a;
        return Gcd(b,a%b);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            long a=sc.nextLong();
            sc.nextLine();
            String b=sc.nextLine();
            long tmp=0;
            for(int i=0;i<b.length();i++){
                long x=b.charAt(i)-48;
                tmp=tmp*10+x;
                tmp%=a;
            }
            System.out.println(Gcd(tmp,a));
        }
    }
}

import java.math.BigInteger;
import java.util.*;
public class J03033 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            BigInteger re1=new BigInteger(sc.next());
            BigInteger re2=new BigInteger(sc.next());
            BigInteger g=re1.gcd(re2);
            BigInteger m=re1.multiply(re2);
            BigInteger r=m.divide(g);
            System.out.println(r.toString());
        }
    }
}

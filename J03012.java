import java.math.BigInteger;
import java.util.*;
public class J03012 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
           String re1=sc.next();
           String re2=sc.next();
            BigInteger s1=new BigInteger(re1);
            BigInteger s2=new BigInteger(re2);
            System.out.println(s1.add(s2));
        }
    }
}

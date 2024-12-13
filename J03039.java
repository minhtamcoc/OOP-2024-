import java.math.BigInteger;
import java.util.*;
public class J03039 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s1=sc.next();
            String s2=sc.next();
            BigInteger a=new BigInteger(s1);
            BigInteger b=new BigInteger(s2);
            BigInteger x=a.remainder(b);
            BigInteger y=b.remainder(a);
            String re=x.toString();
            String re1=y.toString();
            if(re.equals("0")||re1.equals("0")){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}

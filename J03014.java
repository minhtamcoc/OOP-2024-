import java.math.BigInteger;
import java.util.*;
public class J03014 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int idx=0;
        while(idx<s1.length()&&s1.charAt(idx)=='0'){
            idx++;
        }
        String re1=(idx==s1.length())?"0":s1.substring(idx);
        int idx1=0;
        while(idx1<s2.length()&&s2.charAt(idx1)=='0'){
            idx1++;
        }
        String re2=(idx1==s2.length())?"0":s2.substring(idx1);
        BigInteger t1=new BigInteger(re1);
        BigInteger t2=new BigInteger(re2);
        System.out.println(t1.add(t2));
    }
}

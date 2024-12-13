import java.util.*;
public class J01009 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long res=0;
    long x=1;
    for(int i=1;i<=n;i++){
        x*=i;
        res+=x;
    }
    System.out.println(res);
}
}

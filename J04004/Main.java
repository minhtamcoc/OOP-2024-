import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t1=sc.nextInt();
        long m1=sc.nextInt();
        long t2=sc.nextInt();
        long m2=sc.nextInt();
        PhanSo p1=new PhanSo(t1,m1);
        PhanSo p2=new PhanSo(t2,m2);
        PhanSo re=p1.Tong(p2);
        System.out.println(re);
    }
}
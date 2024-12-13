import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long t1=sc.nextInt();
            long m1=sc.nextInt();
            long t2=sc.nextInt();
            long m2=sc.nextInt();
            PhanSo A=new PhanSo(t1,m1);
            PhanSo B=new PhanSo(t2,m2);
            PhanSo C=A.RES1(B);
            System.out.print(C+" ");
            PhanSo D=A.RES2(B,C);
            System.out.println(D);
        }
    }
}
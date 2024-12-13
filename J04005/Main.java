import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String age=sc.nextLine();
        float m1=sc.nextFloat();
        float m2=sc.nextFloat();
        float m3=sc.nextFloat();
        ThiSinh x=new ThiSinh(name,age,m1,m2,m3);
        System.out.println(x);
    }
}
// Nguyen Hoang Ha
// 11/10/2001
// 4.5
// 10.0
// 5.5
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String id=sc.nextLine();
        String name=sc.nextLine();
        int luongcoban=sc.nextInt();
        GiaoVien x=new GiaoVien(id,name,luongcoban);
        System.out.println(x);
    }
}
// HP04
// Tran Quoc Huy
// 1578000
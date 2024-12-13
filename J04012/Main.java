import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        long luongcoban=sc.nextLong();
        long songaycong=sc.nextLong();
        String chucvu=sc.next();
        NhanVien x=new NhanVien(name,luongcoban,songaycong,chucvu);
        System.out.println(x);
    }
}
// Bui Thi Trang
// 45000
// 23
// PGD
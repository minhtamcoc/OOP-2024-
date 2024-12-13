import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Luong> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name=sc.nextLine();
            long luongngay=sc.nextLong();
            long songaycong=sc.nextLong();
            sc.nextLine();
            String chucvu=sc.nextLine();
            list.add(new Luong(name,luongngay,songaycong,chucvu));
        }
        long tong=0;
        for(Luong x:list){
            System.out.println(x);
            tong+=x.getTL();
        }
        System.out.println("Tong chi phi tien luong: "+tong);
    }
}
// 5
// Cao Van Vu
// 50000
// 26
// GD
// Bui Thi Trang
// 45000
// 23
// PGD
// Do Van Truong
// 40000
// 25
// PGD
// Nguyen Van Cam
// 37000
// 26
// TP
// Truong Thi Tu Linh
// 45000
// 22
// NV
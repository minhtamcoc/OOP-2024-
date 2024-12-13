import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Luong> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name=sc.nextLine();
            long luongcoban=sc.nextLong();
            long songaycong=sc.nextLong();
            sc.nextLine();
            String chucvu=sc.nextLine();
            list.add(new Luong(name,luongcoban,songaycong,chucvu));
        }
        for(Luong x:list){
            System.out.println(x);
        }
    }
}
// 3
// Cao Van Vu
// 50000
// 26
// GD
// Do Van Truong
// 40000
// 25
// PGD
// Truong Thi Tu Linh
// 45000
// 22
// NV
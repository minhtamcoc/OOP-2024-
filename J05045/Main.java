import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<NhanVien> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name=sc.nextLine();
            String chucvu=sc.nextLine();
            long luongcoban=sc.nextLong();
            long songaycong=sc.nextLong();
            sc.nextLine();
            list.add(new NhanVien(name,chucvu,luongcoban,songaycong));
        }
        list.sort(new Comparator<NhanVien>() {
            public int compare(NhanVien x,NhanVien y){
                if(x.getTN()==y.getTN()) return x.getId().compareTo(y.getId());
                return Long.compare(y.getTN(),x.getTN());
            }
        });
        for(NhanVien x:list){
            System.out.println(x);
        }
    }
}
// 4
// Tran Thi Yen
// NV
// 1000
// 24
// Nguyen Van Thanh
// BV
// 1000
// 30
// Doan Truong An
// TP
// 3000
// 25
// Le Thanh
// GD
// 5000
// 28
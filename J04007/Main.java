import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String sex=sc.nextLine();
        String age=sc.nextLine();
        String add=sc.nextLine();
        String mst=sc.nextLine();
        String date=sc.nextLine();
        NhanVien x=new NhanVien(name,sex,age,add,mst,date);
        System.out.println(x);
    }
}
// Nguyen Van Hoa
// Nam
// 22/11/1982
// Mo Lao-Ha Dong-Ha Noi
// 8333123456
// 31/12/2013
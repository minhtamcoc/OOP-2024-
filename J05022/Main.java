import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<SinhVien> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String lop=sc.nextLine();
            String mail=sc.nextLine();
            list.add(new SinhVien(id,name,lop,mail));
        }
        int q=sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String s=sc.nextLine();
            System.out.print("DANH SACH SINH VIEN LOP ");
            System.out.println(s+":");
        for(SinhVien x:list){
            if(x.getLop().equals(s)){
                System.out.println(x);
            }
        }
    }
    }
}
// 4
// B16DCCN011
// Nguyen Trong Duc Anh
// D16CNPM1
// sv1@stu.ptit.edu.vn
// B15DCCN215
// To Ngoc Hieu
// D15CNPM3
// sv2@stu.ptit.edu.vn
// B15DCKT150
// Nguyen Ngoc Son
// D15CQKT02-B
// sv3@stu.ptit.edu.vn
// B15DCKT199
// Nguyen Trong Tung
// D15CQKT02-B
// sv4@stu.ptit.edu.vn
// 1
// D15CQKT02-B
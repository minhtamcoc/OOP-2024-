import java.util.*;
public class Main {
    // cau nay phai theo lop ms AC
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
            System.out.print("DANH SACH SINH VIEN KHOA ");
            System.out.println(s+":");
            for(SinhVien x:list){
                if(x.getKhoa().equals(s)){
                    System.out.println(x);
                }
            }
        }
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<GiangVien> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name=sc.nextLine();
            String nganh=sc.nextLine();
            list.add(new GiangVien(name,nganh));
        }
        int q=sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String s=sc.nextLine();
            System.out.print("DANH SACH GIANG VIEN THEO TU KHOA ");
            System.out.println(s+":");
            for(GiangVien x:list){
                if(x.getName().toLowerCase().contains(s.toLowerCase())){
                    System.out.println(x);
                }
            }
        }
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<NhanVien> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name=sc.nextLine();
            String sex=sc.nextLine();
            String age=sc.nextLine();
            String add=sc.nextLine();
            String mst=sc.nextLine();
            String hd=sc.nextLine();
            list.add(new NhanVien(name,sex,age,add,mst,hd));
        }
        for(NhanVien x:list){
            System.out.println(x);
        }
    }
}
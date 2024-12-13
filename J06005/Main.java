import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<KhachHang> list1=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name=sc.nextLine();
            String gender=sc.nextLine();
            String age=sc.nextLine();
            String add=sc.nextLine();
            list1.add(new KhachHang(name,gender,age,add));
        }
        t=sc.nextInt();
        List<MatHang> list2=new ArrayList<>();
        sc.nextLine();
        while(t-->0){
            String name=sc.nextLine();
            String donvi=sc.nextLine();
            int giamua=sc.nextInt();
            int giaban=sc.nextInt();
            sc.nextLine();
            list2.add(new MatHang(name,donvi,giamua,giaban));
        }
        t=sc.nextInt();
        List<HoaDon> list3=new ArrayList<>();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            String[] ss=s.split(" ");
            String idKH=ss[0];
            String idMH=ss[1];
            int soluong=Integer.parseInt(ss[2]);
            list3.add(new HoaDon(idKH,idMH,soluong));
        }
        for(HoaDon x:list3){
            for(KhachHang y:list1){
                if(x.getIDKH().equals(y.getID())){
                    x.setNameKH(y.getName());
                    x.setADD(y.getADD());
                    break;
                }
            }
            for(MatHang y:list2){
                if(x.getIDMH().equals(y.getID())){
                    x.setNameMH(y.getName());
                    x.setDV(y.getDV());
                    x.setGB(y.getGB());
                    x.setGM(y.getGM());
                    x.setT();
                    break;
                }
            }
        }
        for(HoaDon x:list3){
            System.out.println(x);
        }
    }
}
// 2
// Nguyen Van Nam
// Nam
// 12/12/1997
// Mo Lao-Ha Dong-Ha Noi
// Tran Van Binh
// Nam
// 11/14/1995
// Phung Khoang-Nam Tu Liem-Ha Noi
// 2
// Ao phong tre em
// Cai
// 25000
// 41000
// Ao khoac nam
// Cai
// 240000
// 515000
// 3
// KH001 MH001 2
// KH001 MH002 3
// KH002 MH002 4
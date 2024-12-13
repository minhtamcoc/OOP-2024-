import java.util.*;
import java.io.*;
import java.text.ParseException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException,ParseException{
        File f=new File("MUAHANG.in");
        Scanner sc=new Scanner(f);
        List<SanPham> list1=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String idSP=sc.nextLine();
            String nameSP=sc.nextLine();
            int giaban=Integer.parseInt(sc.nextLine());
            int baohanh=Integer.parseInt(sc.nextLine());
            list1.add(new SanPham(idSP,nameSP,giaban,baohanh));
        }
        List<KhachHang> list2=new ArrayList<>();
        t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String name=sc.nextLine();
            String add=sc.nextLine();
            String idSP=sc.nextLine();
            int soluong=Integer.parseInt(sc.nextLine());
            String ngaymua=sc.nextLine();
            for(SanPham x:list1){
                if(x.getIdSP().equals(idSP)){
                    list2.add(new KhachHang(name,add,idSP,soluong,ngaymua,x.getGB(),x.getBH()));
                    break;
                }
            }
        }
        list2.sort(new Comparator<KhachHang>() {
                public int compare(KhachHang x,KhachHang y){
                    if(x.getYear()!=y.getYear()) return Integer.compare(x.getYear(),y.getYear());
                    if(x.getMonth()!=y.getMonth()) return Integer.compare(x.getMonth(),y.getMonth());
                    if(x.getDay()!=y.getDay()) return Integer.compare(x.getDay(),y.getDay());
                    return x.getID().compareTo(y.getID());
                }
        });
        for(KhachHang x:list2){
            System.out.println(x);
        }
}
}
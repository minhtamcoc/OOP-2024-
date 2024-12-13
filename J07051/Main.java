import java.util.*;
import java.io.*;
import java.text.ParseException;
public class Main{
    public static void main(String[] args) throws FileNotFoundException,ParseException{
        File f=new File("KHACHHANG.in");
        Scanner sc=new Scanner(f);
        int t=Integer.parseInt(sc.nextLine());
        List<KhachHang> list=new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine().toLowerCase().trim();
            String numberP=sc.nextLine();
            String s=sc.nextLine();
            String e=sc.nextLine();
            long addFee=Long.parseLong(sc.nextLine());
            list.add(new KhachHang(name, numberP, s, e, addFee));
        }
        list.sort(new Comparator<KhachHang>() {
            public int compare(KhachHang x,KhachHang y){
                return Long.compare(y.getFee(),x.getFee());
            }
        });
        for(KhachHang x:list){
            System.out.println(x);
        }
    }
}


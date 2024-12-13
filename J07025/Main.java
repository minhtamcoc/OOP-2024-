import java.util.*;
import java.io.*;
import java.text.ParseException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException,ParseException{
        File f=new File("KHACHHANG.in");
        Scanner sc=new Scanner(f);
        List<KhachHang> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine().trim());
        while(t-->0){
            String name=sc.nextLine().toLowerCase().trim();
            String sex=sc.nextLine().trim();
            String age=sc.nextLine().trim();
            String add=sc.nextLine().trim();
            list.add(new KhachHang(name,sex,age,add));
        }
        list.sort(new Comparator<KhachHang>() {
            public int compare(KhachHang x,KhachHang y){
                if(x.getYear()!=y.getYear()) return Integer.compare(x.getYear(),y.getYear());
                if(x.getMonth()!=y.getMonth()) return Integer.compare(x.getMonth(),y.getMonth());
                return Integer.compare(x.getDay(),y.getDay());
            }
        });
        for(KhachHang x:list){
            System.out.println(x);
        }
    }
}
import java.util.*;
import java.io.*;
import java.text.ParseException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException,ParseException {
        File f=new File("KHACH.in");
        Scanner sc=new Scanner(f);
        List<KhachHang> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String name=sc.nextLine();
            String idP=sc.nextLine();
            String ngayden=sc.nextLine();
            String ngaydi=sc.nextLine();
            list.add(new KhachHang(name, idP, ngayden, ngaydi));
        }
        list.sort(new Comparator<KhachHang>() {
            public int compare(KhachHang x,KhachHang y){
                return Long.compare(y.getNgayo(),x.getNgayo());
            }
        });
        for(KhachHang x:list){
            System.out.println(x);
        }
    }   
}

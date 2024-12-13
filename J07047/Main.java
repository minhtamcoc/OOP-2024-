import java.util.*;
import java.io.*;
import java.text.ParseException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException,ParseException{
        File f=new File("DATA.in");
        Scanner sc=new Scanner(f);
        List<Phong> list1=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            String[] ss=s.split("\\s+");
            String id=ss[0];
            String name=ss[1];
            long dongia=Long.parseLong(ss[2]);
            double phiphucvu=Double.parseDouble(ss[3]);
            list1.add(new Phong(id,name,dongia,phiphucvu));
        }
        t=Integer.parseInt(sc.nextLine());
        List<KhachHang> list2=new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            String maphong=sc.nextLine();
            String start=sc.nextLine();
            String end=sc.nextLine();
            String re=maphong.substring(2,3);
            for(Phong x:list1){
                if(x.getId().equals(re)){
                    list2.add(new KhachHang(name,maphong,start,end,x.getDonGia(),x.getPhiPhucVu()));
                }
            }
        }
        list2.sort(new Comparator<KhachHang>() {
            public int compare(KhachHang x,KhachHang y){
                return Long.compare(y.getNgayO(),x.getNgayO());
            }
        });
        for(KhachHang x:list2){
            System.out.println(x);
        }
    }
}
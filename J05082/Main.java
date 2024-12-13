import java.text.ParseException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        List<KhachHang> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name=sc.nextLine().toLowerCase().trim();
            String gioitinh=sc.nextLine();
            String age=sc.nextLine();
            String add=sc.nextLine();
            list.add(new KhachHang(name,gioitinh,age,add));
        }
        list.sort(new Comparator<KhachHang>() {
            public int compare(KhachHang x,KhachHang y){
                return Long.compare(x.getT(),y.getT());
            }
        });
        for(KhachHang x:list){
            System.out.println(x);
        }
    }
}
// 2
//  nGuyen VAN     nAm
// Nam
// 12/12/1997
// Mo Lao-Ha Dong-Ha Noi
//  TRan    vAn     biNh
// Nam
// 14/11/1995
// Phung Khoang-Nam Tu Liem-Ha Noi
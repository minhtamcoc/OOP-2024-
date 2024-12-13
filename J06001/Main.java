import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        List<SanPham> list1=new ArrayList<>();
        sc.nextLine();
        while(t-->0){
            String idSP=sc.nextLine();
            String nameSP=sc.nextLine();
            long dongia1=sc.nextLong();
            long dongia2=sc.nextLong();
            sc.nextLine();
            list1.add(new SanPham(idSP,nameSP,dongia1,dongia2));
        }
        List<HoaDon> list2=new ArrayList<>();
        t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            String[] ss=s.split(" ");
            String maloai=ss[0];
            Long soluong=Long.parseLong(ss[1]);
            String re1=maloai.substring(0,2);
            String re2=maloai.substring(2,3);
            for(SanPham x:list1){
                if(re1.equals(x.getIDSP())){
                    if(re2.equals("1")) list2.add(new HoaDon(maloai,soluong,x.getNameSP(),x.getDG1()));
                    else list2.add(new HoaDon(maloai,soluong,x.getNameSP(),x.getDG2()));
                }
            }
        }
        for(HoaDon x:list2){
            System.out.println(x);
        }
    }
}
// 2
// AT
// Ao thun
// 80000
// 45000
// QJ
// Quan Jean
// 220000
// 125000
// 2
// AT1 95
// QJ2 105
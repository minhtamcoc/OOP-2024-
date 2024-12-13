import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<PhongBan> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String tmp=sc.nextLine();
            String[] ss=tmp.split(" ");
            String idP=ss[0];
            String res="";
            for(int i=1;i<ss.length;i++){
                res+=ss[i]+" ";
            }
            res=res.trim();
            list.add(new PhongBan(idP,res));
        }
        List<NhanVien> l=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            long luongcoban=sc.nextLong();
            long songaycong=sc.nextLong();
            sc.nextLine();
            l.add(new NhanVien(id,name,luongcoban,songaycong));
        }
        for(PhongBan x:list){
            for(NhanVien y:l){
                String re=y.getID().substring(3);
                if(re.equals(x.getIdP())){
                    y.setP(x.getName());
                }
            }
        }
        for(NhanVien y:l){
            System.out.println(y);
        }
    }
}
// 2
// HC Hanh chinh
// KH Ke hoach Dau tu
// 2
// C06HC
// Tran Binh Minh
// 65
// 25
// D03KH
// Le Hoa Binh
// 59
// 24
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<PhongBan> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            String[] ss=s.split(" ");
            String idp=ss[0];
            String nameP="";
            for(int i=1;i<ss.length;i++){
                nameP+=ss[i]+" ";
            }
            nameP=nameP.trim();
            list.add(new PhongBan(idp,nameP));
        }
        List<NhanVien> st=new ArrayList<>();
        int q=sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            long luongcoban=sc.nextLong();
            long songaycong=sc.nextLong();
            sc.nextLine();
            st.add(new NhanVien(id,name,luongcoban,songaycong));
        }
        for(PhongBan x:list){
            for(NhanVien y:st){
                if(x.getIDP().equals(y.getMaP())){
                    y.setP(x.getName());
                }
            }
        }
        String s=sc.next();
        System.out.print("Bang luong phong ");
        for(PhongBan x:list){
            if(s.equals(x.getIDP())){
                System.out.println(x.getName()+":");
                break;
            }
        }
        for(NhanVien x:st){
            if(x.getMaP().equals(s)){
                System.out.println(x);
            }
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
// KH
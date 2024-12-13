import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File f1=new File("KH.in");
        Scanner sc1=new Scanner(f1);
        List<KhachHang> list1=new ArrayList<>();
        int t=Integer.parseInt(sc1.nextLine());
        while(t-->0){
            String nameKH=sc1.nextLine();
            String gioitinh=sc1.nextLine();
            String age=sc1.nextLine();
            String addr=sc1.nextLine();
            list1.add(new KhachHang(nameKH,gioitinh,age,addr));
        }
        sc1.close();
        File f2=new File("MH.in");
        Scanner sc2=new Scanner(f2);
        List<MatHang> list2=new ArrayList<>();
        int q=Integer.parseInt(sc2.nextLine());
        while(q-->0){
            String nameMH=sc2.nextLine();
            String donvi=sc2.nextLine();
            int giamua=Integer.parseInt(sc2.nextLine());
            int giaban=Integer.parseInt(sc2.nextLine());
            list2.add(new MatHang(nameMH,donvi,giamua,giaban));
        }
        sc2.close();
        File f3=new File("HD.in");
        Scanner sc3=new Scanner(f3);
        List<HoaDon> list3=new ArrayList<>();
        int n=Integer.parseInt(sc3.nextLine());
        while(n-->0){
            String s=sc3.nextLine();
            String[] ss=s.split(" ");
            String re1=ss[0];
            String re2=ss[1];
            String re3=ss[2];
            list3.add(new HoaDon(re1,re2,Integer.parseInt(re3)));
        }
        sc3.close();
        for(HoaDon x:list3){
            for(KhachHang y:list1){
                if(x.getIDKH().equals(y.getIDKH())){
                    x.setAddr(y.getADDR());
                    x.setNameKH(y.getNameKH());
                    break;
                }
            }
            for(MatHang z:list2){
                if(x.getIDMH().equals(z.getIDMH())){
                    x.setDV(z.getDV());
                    x.setNameMH(z.getNameMH());
                    x.setGiaMua(z.getGM());
                    x.setGiaBan(z.getGB());
                    break;
                }
            }
            x.setT();
        }
        for(HoaDon x:list3){
            System.out.println(x);
        }
    }
}
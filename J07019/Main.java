import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File f1=new File("DATA1.in");
        Scanner sc1=new Scanner(f1);
        List<SanPham> list1=new ArrayList<>();
        int t=Integer.parseInt(sc1.nextLine());
        while(t-->0){
            String idS=sc1.nextLine();
            String nameS=sc1.nextLine();
            long dongia1=Long.parseLong(sc1.nextLine());
            long dongia2=Long.parseLong(sc1.nextLine());
            list1.add(new SanPham(idS,nameS,dongia1,dongia2));
        }
        sc1.close();
        File f2=new File("DATA2.in");
        Scanner sc2=new Scanner(f2);
        List<HoaDon> list2=new ArrayList<>();
        int q=Integer.parseInt(sc2.nextLine());
        while(q-->0){
            String s=sc2.nextLine().trim();
            String[] ss=s.split(" ");
            String tmp=ss[0].substring(0,2);
            for(SanPham x:list1){
                if(x.getIdS().equals(tmp)){
                    list2.add(new HoaDon(x.getIdS(),x.getNames(),x.getDG1(),x.getDG2(),ss[0],Long.parseLong(ss[1])));
                }
            }
        }
        sc2.close();
        for(HoaDon x:list2){
            System.out.println(x);
        }
    }
}
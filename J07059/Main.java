import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File f=new File("CATHI.in");
        Scanner sc=new Scanner(f);
        List<DanhSach> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String ngaythi=sc.nextLine();
            String giothi=sc.nextLine();
            String phongthi=sc.nextLine();
            list.add(new DanhSach(ngaythi,giothi,phongthi));
        }
        list.sort(new Comparator<DanhSach>() {
            public int compare(DanhSach x,DanhSach y){
                if(x.getDay()!=y.getDay()) return Integer.compare(x.getDay(),y.getDay());
                if(x.getH()!=y.getH()) return Integer.compare(x.getH(),y.getH());
                if(x.getP()!=y.getP()) return Integer.compare(x.getP(),y.getP());
                return x.getId().compareTo(y.getId());
            }
        });
        for(DanhSach x:list){
            System.out.println(x);
        }
    }
}
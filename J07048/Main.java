package J07048;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        File f=new File("SANPHAM.in");
        try{
            Scanner sc=new Scanner(f);
            List<SanPham> list=new ArrayList<>();
            int t=Integer.parseInt(sc.nextLine());
            while(t-->0){
                String id=sc.nextLine();
                String name=sc.nextLine();
                int gia=Integer.parseInt(sc.nextLine());
                int tg=Integer.parseInt(sc.nextLine());
                list.add(new SanPham(id, name, gia, tg));
            }
            list.sort(new Comparator<SanPham>(){
                public int compare(SanPham x,SanPham y){
                    if(x.getGiaban()==y.getGiaban()){
                        return x.getID().compareTo(y.getID());
                    }
                    return Integer.compare(y.getGiaban(),x.getGiaban());
                }
            });
            for(SanPham x:list){
                System.out.println(x);
            }
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}

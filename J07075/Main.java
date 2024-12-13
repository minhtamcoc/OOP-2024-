import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File f1=new File("MONHOC.in");
        Scanner sc1=new Scanner(f1);
        List<MonHoc> list1=new ArrayList<>();
        int t=Integer.parseInt(sc1.nextLine());
        while(t-->0){
            String idM=sc1.nextLine().trim();
            String nameM=sc1.nextLine().trim();
            int sotin=Integer.parseInt(sc1.nextLine());
            list1.add(new MonHoc(idM,nameM,sotin));
        }
        sc1.close();
        File f2=new File("LICHGD.in");
        Scanner sc2=new Scanner(f2);
        List<Lop> list2=new ArrayList<>();
        int q=Integer.parseInt(sc2.nextLine());
        while(q-->0){
            String idM=sc2.nextLine().trim();
            int day=Integer.parseInt(sc2.nextLine());
            int kip=Integer.parseInt(sc2.nextLine());
            String giangvien=sc2.nextLine();
            String phong=sc2.nextLine();
            list2.add(new Lop(idM,day,kip,giangvien,phong));
        }
        String s=sc2.nextLine();
        sc2.close();
        System.out.println("LICH GIANG DAY GIANG VIEN "+s+":");
       for(Lop x:list2){
        for(MonHoc y:list1){
            if(x.getIDM().equals(y.getIDM())){
                x.setNAMEM(y.getNameM());
            }
        }
       }
       list2.sort(new Comparator<Lop>() {
            public int compare(Lop x,Lop y){
                if(x.getDay()!=y.getDay()) return Integer.compare(x.getDay(),y.getDay());
                if(x.getKip()!=y.getKip()) return Integer.compare(x.getKip(),y.getKip());
                return x.getGV().compareTo(y.getGV());
            }
       });
       for(Lop x:list2){
            if(x.getGV().equals(s)){
                System.out.println(x);
            }
       }
    }   
}
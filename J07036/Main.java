import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File f1=new File("SINHVIEN.in");
        Scanner sc=new Scanner(f1);
        List<SinhVien> list1=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine().toLowerCase().trim();
            String lop=sc.nextLine();
            String mail=sc.nextLine();
            list1.add(new SinhVien(id,name,lop,mail));
        }
        sc.close();
        File f2=new File("MONHOC.in");
        sc=new Scanner(f2);
        List<MonHoc> list2=new ArrayList<>();
        t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            int sotin=Integer.parseInt(sc.nextLine());
            list2.add(new MonHoc(id,name,sotin));
        }
        sc.close();
        File f3=new File("BANGDIEM.in");
        sc=new Scanner(f3);
        List<BangDiem> list3=new ArrayList<>();
        t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            String[] ss=s.split(" ");
            String idSV=ss[0];
            String idMH=ss[1];
            double GPA=Double.parseDouble(ss[2]);
            BangDiem tmp=new BangDiem(idSV,idMH,GPA);
            for(SinhVien x:list1){
                if(x.getID().equals(idSV)){
                    tmp.setSV(x);
                    break;
                }
            }
            for(MonHoc x:list2){
                if(x.getId().equals(idMH)){
                    tmp.setMH(x);
                    break;
                }
            }
            list3.add(tmp);
        }
        list3.sort(new Comparator<BangDiem>() {
            public int compare(BangDiem x,BangDiem y){
                if(x.getIDMH().equals(y.getIDMH())) return x.getIDSV().compareTo(y.getIDSV());
                return x.getIDMH().compareTo(y.getIDMH());
            }
        });
        int q=Integer.parseInt(sc.nextLine());
        while(q-->0){
            String s=sc.nextLine();
            System.out.println("BANG DIEM lop "+s+":");
            for(BangDiem x:list3){
                if(x.getLop().equals(s)){
                    System.out.println(x);
                }
            }
        }
    }
}
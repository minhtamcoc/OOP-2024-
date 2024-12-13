import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File f1=new File("SINHVIEN.in");
        Scanner sc1=new Scanner(f1);
        List<SinhVien> list1=new ArrayList<>();
        int t=Integer.parseInt(sc1.nextLine());
        while(t-->0){
            String id=sc1.nextLine();
            String name=sc1.nextLine().toLowerCase().trim();
            String lop=sc1.nextLine();
            String mail=sc1.nextLine();
            list1.add(new SinhVien(id,name,lop,mail));
        }
        sc1.close();
        File f2=new File("MONHOC.in");
        Scanner sc2=new Scanner(f2);
        List<MonHoc> list2=new ArrayList<>();
        t=Integer.parseInt(sc2.nextLine());
        while(t-->0){
            String id=sc2.nextLine();
            String name=sc2.nextLine();
            String tinchi=sc2.nextLine();
            list2.add(new MonHoc(id,name,tinchi));
        }
        sc2.close();
        File f3=new File("BANGDIEM.in");
        Scanner sc3=new Scanner(f3);
        List<BangDiem> list3=new ArrayList<>();
        t=Integer.parseInt(sc3.nextLine());
        while(t-->0){
            String s=sc3.nextLine();
            String[] ss=s.split(" ");
            String idSV=ss[0];
            String idM=ss[1];
            double diem=Double.parseDouble(ss[2]);
            list3.add(new BangDiem(idSV,idM,diem));
        }
        for(BangDiem x:list3){
            for(SinhVien y:list1){
                if(x.getIdSV().equals(y.getID())){
                    x.setLop(y.getLop());
                    x.setName(y.getName());
                    break;
                }
            }
            for(MonHoc z:list2){
                if(x.getIdM().equals(z.getID())){
                    x.setTM(z.getName());
                    break;
                }
            }
        }
        list3.sort(new Comparator<BangDiem>(){
            public int compare(BangDiem x,BangDiem y){
                if(x.getDiem()==y.getDiem()) return x.getIdSV().compareTo(y.getIdSV());
                return Double.compare(y.getDiem(),x.getDiem());
            }
        });
        t=Integer.parseInt(sc3.nextLine());
        while(t-->0){
            String s=sc3.nextLine();
            int cnt=0;
            for(BangDiem x:list3){
                if(x.getIdM().equals(s)){
                   if(cnt==0){
                     System.out.println("BANG DIEM MON "+x.getTM()+":");
                     cnt++;
                   }
                   System.out.println(x);
                }
            }
        }
    }
}
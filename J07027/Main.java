import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File f1=new File("SINHVIEN.in");
        Scanner sc1=new Scanner(f1);
        List<SinhVien> list1=new ArrayList<>();
        int t=Integer.parseInt(sc1.nextLine());
        int n=t;
        while(t-->0){
            String id=sc1.nextLine();
            String name=sc1.nextLine();
            String number=sc1.nextLine();
            list1.add(new SinhVien(id,name,number));
        }
        sc1.close();
        File f2=new File("BAITAP.in");
        Scanner sc2=new Scanner(f2);
        List<BaiTap> list2=new ArrayList<>();
        t=Integer.parseInt(sc2.nextLine());
        while(t-->0){
            String nameBT=sc2.nextLine();
            list2.add(new BaiTap(nameBT));
        }
        sc2.close();
        File f3=new File("NHOM.in");
        List<Nhom> list3=new ArrayList<>();
        Scanner sc3=new Scanner(f3);
        while(n-->0){
            String s=sc3.nextLine().trim();
            String[] ss=s.split(" ");
            String nameN=ss[0];
            String sttBT=ss[1];
            list3.add(new Nhom(nameN,sttBT));
        }
        sc3.close();
        for(SinhVien x:list1){
            String re=x.getId();
            for(Nhom y:list3){
                if(re.equals(y.getNameN())){
                   x.setSTTBT(y.getStt());
                    break;
                }
            }
            String tmp=x.getSTTBT();
            for(BaiTap z:list2){
                if(tmp.equals(z.getIDBT())){
                   x.setNameBT(z.getNameBt());
                    break;
                }
            }
        }
        list1.sort(new Comparator<SinhVien>() {
            public int compare(SinhVien x,SinhVien y){
                return x.getId().compareTo(y.getId());
            }
        });
        for(SinhVien x:list1){
            System.out.println(x);
        }
    }
}
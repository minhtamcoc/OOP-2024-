import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File f1=new File("MONHOC.in");
        Scanner sc1=new Scanner(f1);
        List<MonHoc> list1=new ArrayList<>();
        int t=Integer.parseInt(sc1.nextLine());
        while(t-->0){
            String s=sc1.nextLine();
            String[] ss=s.split(" ");
            String idM=ss[0];
            String tmp="";
            for(int i=1;i<ss.length;i++){
                tmp+=ss[i];
            }
            String nameM=tmp;
            list1.add(new MonHoc(idM,nameM));
        }
        sc1.close();
        File f2=new File("GIANGVIEN.in");
        Scanner sc2=new Scanner(f2);
        List<GiangVien> list2=new ArrayList<>();
        t=Integer.parseInt(sc2.nextLine());
        while(t-->0){
            String s=sc2.nextLine();
            String[] ss=s.split(" ");
            String idGV=ss[0];
            String nameGV="";
            for(int i=1;i<ss.length;i++){
                nameGV+=ss[i]+" ";
            }
            list2.add(new GiangVien(idGV,nameGV.trim()));
        }
        sc2.close();
        File f3=new File("GIOCHUAN.in");
        Scanner sc3=new Scanner(f3);
        List<GioDung> list3=new ArrayList<>();
        t=Integer.parseInt(sc3.nextLine());
        while(t-->0){
            String s=sc3.nextLine();
            String[] ss=s.split(" ");
            String idGV=ss[0];
            String idM=ss[1];
            double time=Double.parseDouble(ss[2]);
            list3.add(new GioDung(idGV,idM,time));
        }
        sc3.close();
        for(GiangVien x:list2){
            for(GioDung y:list3){
                if(x.getIDGV().equals(y.getIDGV())){
                    x.setTime(y.getTime());
                }
            }
        }
        for(GiangVien x:list2){
            System.out.println(x);
        }
    }
}
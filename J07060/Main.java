import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File f1=new File("MONTHI.in");
        Scanner sc1=new Scanner(f1);
        List<MonThi> list1=new ArrayList<>();
        int t=Integer.parseInt(sc1.nextLine());
        while(t-->0){
            String idM=sc1.nextLine();
            String nameM=sc1.nextLine();
            String hinhthuc=sc1.nextLine();
            list1.add(new MonThi(idM,nameM,hinhthuc));
        }
        sc1.close();
        File f2=new File("CATHI.in");
        Scanner sc2=new Scanner(f2);
        List<CaThi> list2=new ArrayList<>();
        t=Integer.parseInt(sc2.nextLine());
        while(t-->0){
            String ngaythi=sc2.nextLine();
            String time=sc2.nextLine();
            String idP=sc2.nextLine();
            list2.add(new CaThi(ngaythi,time,idP));
        }
        sc2.close();
        File f3=new File("LICHTHI.in");
        Scanner sc3=new Scanner(f3);
        List<LichThi> list3=new ArrayList<>();
        t=Integer.parseInt(sc3.nextLine());
        while(t-->0){
            String s=sc3.nextLine();
            String[] ss=s.split(" ");
            String idCT=ss[0];
            String idM=ss[1];
            String idN=ss[2];
            int sosinhvien=Integer.parseInt(ss[3]);
            list3.add(new LichThi(idCT,idM,idN,sosinhvien));
        }
        for(LichThi x:list3){
            for(CaThi y:list2){
                if(x.getIDCT().equals(y.getIDCT())){
                    x.setIDP(y.getIDP());
                    x.setNgayThi(y.getNGAYTHI());
                    x.setTIME(y.getTIME());
                    break;
                }
            }
            for(MonThi y:list1){
                if(x.getIDM().equals(y.getIDM())){
                    x.setNameM(y.getNameM());
                    break;
                }
            }
        }
        list3.sort(new Comparator<LichThi>() {
            public int compare(LichThi x,LichThi y){
                if(x.getYEAR()!=y.getYEAR()) return Integer.compare(x.getYEAR(),y.getYEAR());
                if(x.getMONTH()!=y.getMONTH()) return Integer.compare(x.getMONTH(),y.getMONTH());
                if(x.getDAY()!=y.getDAY()) return Integer.compare(x.getDAY(),y.getDAY());
                if(x.getH()!=y.getH()) return Integer.compare(x.getH(),y.getH());
                return Integer.compare(x.getP(),y.getP());
            }
        });
        for(LichThi x:list3){
            System.out.println(x);
        }
    }
}
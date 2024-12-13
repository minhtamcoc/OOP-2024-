import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<MonHoc> list1=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            String[] ss=s.split(" ");
            String idM=ss[0];
            String nameM="";
            for(int i=1;i<ss.length;i++){
                nameM+=ss[i]+" ";
            }
            nameM=nameM.trim();
            list1.add(new MonHoc(idM,nameM));
        }
        List<GiaoVien> list2=new ArrayList<>();
        t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            String[] ss=s.split(" ");
            String idGV=ss[0];
            String nameGV="";
            for(int i=1;i<ss.length;i++){
                nameGV+=ss[i]+" ";
            }
            nameGV=nameGV.trim();
            list2.add(new GiaoVien(idGV,nameGV));
        }
        List<GIO> list3=new ArrayList<>();
        t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            String[] ss=s.split(" ");
            String idGV=ss[0];
            String idM=ss[1];
            double gio=Double.parseDouble(ss[2]);
            list3.add(new GIO(idGV,idM,gio));
        }
        for(GiaoVien x:list2){
            for(GIO y:list3){
                if(x.getIDGV().equals(y.getIDV())){
                    x.setTime(y.getTIME());
                }
            }
        }
        for(GiaoVien x:list2){
            System.out.println(x);
        }
    }
}
// 2
// INT1155 Tin hoc co so 2
// INT1306 Cau truc du lieu va giai thuat
// 2
// GV01 Nguyen Van An
// GV02 Hoang Binh Minh
// 2
// GV01 INT1155 113.2
// GV02 INT1306 126.72
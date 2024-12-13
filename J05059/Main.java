import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<DanhSach> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            double toan=sc.nextDouble();
            double ly=sc.nextDouble();
            double hoa=sc.nextDouble();
            sc.nextLine();
            list.add(new DanhSach(id,name,toan,ly,hoa));
        }
        list.sort(new Comparator<DanhSach>() {
            public int compare(DanhSach x,DanhSach y){
                if(x.getT()==y.getT()) return x.getId().compareTo(y.getId());
                return Double.compare(y.getT(),x.getT());
            }
        });
        int n=sc.nextInt();
        double tmp=list.get(n-1).getT();
        System.out.printf("%.1f\n",tmp);
        for(DanhSach x:list){
            if(x.getT()>=tmp) x.setSt("TRUNG TUYEN");
            else x.setSt("TRUOT");
        }
        for(DanhSach x:list){
            System.out.println(x);
        }
    }
}
// 3
// KV2A002
// Hoang Thanh Tuan
// 5
// 6
// 5
// KV3B123
// Ly Thi Thu Ha
// 8
// 6.5
// 7
// 1
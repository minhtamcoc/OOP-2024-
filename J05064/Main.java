import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<GiaoVien> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        int cnt=0;
        int res=0;
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            long luongcoban=sc.nextLong();
            sc.nextLine();
            String tmp=id.substring(0,2);
            if(tmp.equals("HT")&&cnt<1) {
                list.add(new GiaoVien(id,name,luongcoban));
                cnt++;
            }
            else if(tmp.equals("HP")&&res<2){
                list.add(new GiaoVien(id,name,luongcoban));
                res++;
            }
            else if(tmp.equals("GV")) list.add(new GiaoVien(id,name,luongcoban));
        }
        for(GiaoVien x:list){
            System.out.println(x);
        }
    }
}
// GV01
// Nguyen Kim Loan
// 1420000
// HT05
// Hoang Thanh Tuan
// 1780000
// GV02
// Tran Binh Nguyen
// 1468000
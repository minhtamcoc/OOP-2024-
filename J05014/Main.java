import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<GiaoVien> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name=sc.nextLine();
            String maxettuyen=sc.nextLine();
            double tinhoc=sc.nextDouble();
            double chuyenmon=sc.nextDouble();
            sc.nextLine();
            list.add(new GiaoVien(name,maxettuyen,tinhoc,chuyenmon));
        }
        list.sort(new Comparator<GiaoVien>() {
            public int compare(GiaoVien x,GiaoVien y){
                if(x.getT()==y.getT()) return x.getId().compareTo(y.getId());
                return Double.compare(y.getT(),x.getT());
            }
        });
        for(GiaoVien x:list){
            System.out.println(x);
        }
    }
}
// 3
// Le Van Binh
// A1
// 7.0
// 3.0
// Tran Van Toan
// B3
// 4.0
// 7.0
// Hoang Thi Tam
// C2
// 7.0
// 6.0
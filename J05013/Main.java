import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<NhanVien> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name=sc.nextLine();
            double lythuyet=sc.nextDouble();
            double thuchanh=sc.nextDouble();
            sc.nextLine();
            list.add(new NhanVien(name,lythuyet,thuchanh));
        }
        list.sort(new Comparator<NhanVien>() {
            public int compare(NhanVien x,NhanVien y){
                return Double.compare(y.getTong(),x.getTong());
            }
        });
        for(NhanVien x:list){
            System.out.println(x);
        }
    }
}
// 3
// Nguyen Thai Binh
// 45
// 75
// Le Cong Hoa
// 4
// 4.5
// Phan Van Duc
// 56
// 56
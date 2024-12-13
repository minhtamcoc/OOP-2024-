import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<HoaDon> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name=sc.nextLine();
            long socu=sc.nextLong();
            long somoi=sc.nextLong();
            sc.nextLine();
            list.add(new HoaDon(name,socu,somoi));
        }
        list.sort(new Comparator<HoaDon>() {
            public int compare(HoaDon x,HoaDon y){
                return Long.compare(y.getT(),x.getT());
            }
        });
        for(HoaDon x:list){
            System.out.println(x);
        }
    }
}
// 3
// Le Thi Thanh
// 468
// 500
// Le Duc Cong
// 160
// 230
// Ha Hue Anh
// 410
// 612
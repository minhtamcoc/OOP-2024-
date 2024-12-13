import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Tien> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            long soluong=sc.nextLong();
            long dongia=sc.nextLong();
            long chietkhau=sc.nextLong();
            sc.nextLine();
            list.add(new Tien(id,name,soluong,dongia,chietkhau));
        }
        list.sort(new Comparator<Tien>() {
            public int compare(Tien x,Tien y){
                return Long.compare(y.getT(),x.getT());
            }
        });
        for(Tien x:list){
            System.out.println(x);
        }
    }
}
// 3
// ML01
// May lanh SANYO
// 12
// 4000000
// 2400000
// ML02
// May lanh HITACHI
// 4
// 2550000000
// 0
// ML03
// May lanh NATIONAL
// 5
// 3000000
// 150000
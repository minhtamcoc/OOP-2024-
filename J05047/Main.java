import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Kho> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name=sc.nextLine();
            int soluong=sc.nextInt();
            int dongia=sc.nextInt();
            sc.nextLine();
            list.add(new Kho(name,soluong,dongia));
        }
        list.sort(new Comparator<Kho>() {
            public int compare(Kho x,Kho y){
                return Integer.compare(y.getCK(),x.getCK());
            }
        });
        for(Kho x:list){
            System.out.println(x);
        }
    }
}
// 3
// May lanh SANYO
// 12
// 4000000
// Dien thoai Samsung
// 30
// 3230000
// Dien thoai Nokia
// 18
// 1240000
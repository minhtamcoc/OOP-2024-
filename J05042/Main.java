import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<XepHang> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name=sc.nextLine();
            int AC=sc.nextInt();
            int submit=sc.nextInt();
            sc.nextLine();
            list.add(new XepHang(name,AC,submit));
        }
        list.sort(new Comparator<XepHang>() {
            public int compare(XepHang x,XepHang y){
                return x.getName().compareTo(y.getName());
            }
        });
        list.sort(new Comparator<XepHang>() {
            public int compare(XepHang x,XepHang y){
                if(x.getAC()==y.getAC()) return Integer.compare(x.getSub(),y.getSub());
                return Integer.compare(y.getAC(),x.getAC());
            }
        });
        for(XepHang x:list){
            System.out.println(x);
        }
    }
}
// 2
// Nguyen Van Nam
// 168 600
// Tran Thi Ngoc
// 168 600
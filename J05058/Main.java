import java.text.ParseException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<ThiSinh> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            double toan=sc.nextDouble();
            double ly=sc.nextDouble();
            double hoa=sc.nextDouble();
            sc.nextLine();
            list.add(new ThiSinh(id,name,toan,ly,hoa));
        }
        list.sort(new Comparator<ThiSinh>() {
            public int compare(ThiSinh x,ThiSinh y){
                if(x.getT()==y.getT()) return x.getId().compareTo(y.getId());
                return Double.compare(y.getT(),x.getT());
            }
        });
        for(ThiSinh x:list){
            System.out.println(x);
        }
    }
}
// 2
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
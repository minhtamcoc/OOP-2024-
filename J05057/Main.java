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
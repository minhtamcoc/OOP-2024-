import java.text.ParseException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc=new Scanner(System.in);
        List<GiaBan> list=new ArrayList<>();
        int t=sc.nextInt();
        while(t-->0){
            String id=sc.next();
            long dongia=sc.nextLong();
            long soluong=sc.nextLong();
            list.add(new GiaBan(id,dongia,soluong));
        }
        for(GiaBan x:list){
            System.out.println(x);
        }
    }
}
// 2
// TTVC 400 300
// CCAK 200 200
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Kho> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String id=sc.next();
            long soluong=sc.nextLong();
            list.add(new Kho(id,soluong));
        }
        for(Kho x:list){
            System.out.println(x);
        }
    }
}
// 5
// N89BP 4500
// D00BP 3500
// X92SH 2600
// X92TN 3600
// D05TN 4000
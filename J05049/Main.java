import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Hang> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String id=sc.nextLine();
           long soluongnhap=sc.nextLong();
           sc.nextLine();
           list.add(new Hang(id,soluongnhap));
        }
        list.sort(new Comparator<Hang>() {
            public int compare(Hang x,Hang y){
                return Long.compare(y.getT(),x.getT());
            }
        });
        String s=sc.next();
        for(Hang x:list){
           if(x.getI().equals(s)) System.out.println(x);
        }
    }
}
// 3
// A001Y
// 1000
// B012N
// 2500
// B003Y
// 4582
// B
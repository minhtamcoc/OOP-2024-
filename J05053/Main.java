import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Hang> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name=sc.nextLine();
            String id=sc.nextLine();
            long dongia=sc.nextLong();
            long soluong=sc.nextLong();
            sc.nextLine();
            list.add(new Hang(name,id,dongia,soluong));
        }
        list.sort(new Comparator<Hang>() {
            public int compare(Hang x,Hang y){
                return x.getaSTT().compareTo(y.getaSTT());
            }
        });
        for(Hang x:list){
            System.out.println(x);
        }
    }
}
// 3
// Kaki 2
// K0252
// 80000
// 15
// Jean 1
// J2011
// 200000
// 24
// Jean 2
// J0982
// 150000
// 12
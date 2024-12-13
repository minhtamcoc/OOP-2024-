import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<CLB> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            long giave=sc.nextLong();
            sc.nextLine();
            list.add(new CLB(id,name,giave));
        }
        int q=sc.nextInt();
        List<Game> v=new ArrayList<>();
        while(q-->0){
            String code=sc.next();
            long khangia=sc.nextLong();
            String s=code.substring(1,3);
            for(CLB x:list){
                if(x.getID().equals(s)){
                    v.add(new Game(x.getID(),x.getName(),x.getGV(), code, khangia,x.getGV()*khangia));
                }
            }
        }
        for(Game x:v){
            System.out.println(x);
        }
    }
}
// 2
// MU
// Manchester United
// 10
// AC
// AC Milan
// 12
// 2
// IAC1 80000
// EMU2 60000
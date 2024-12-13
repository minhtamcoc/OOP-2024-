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
        List<Game> k=new ArrayList<>();
        int q=sc.nextInt();
        while(q-->0){
            String code=sc.next();
            long khangia=sc.nextLong();
            String s=code.substring(1,3);
            for(CLB x:list){
                if(x.getId().equals(s)){
                    k.add(new Game(x.getId(),x.getName(),x.getGiave(),code,khangia,x.getGiave()*khangia));
                }
            }
        }
        k.sort(new Comparator<Game>() {
            public int compare(Game x,Game y){
                if(x.getDT()==y.getDT()) return x.getName().compareTo(y.getName());
                return Long.compare(y.getDT(),x.getDT());
            }
        });
        for(Game x:k){
            System.out.println(x);
        }
    }
}
// 2
// AC
// AC Milan
// 12
// MU
// Manchester United
// 10
// 2
// IAC1 80000
// EMU2 60000
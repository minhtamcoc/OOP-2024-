import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Player> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name=sc.nextLine();
            String age=sc.nextLine();
            String start=sc.nextLine();
            String end=sc.nextLine();
            list.add(new Player(name,age,start,end));
        }
        list.sort(new Comparator<Player>() {
            public int compare(Player x,Player y){
                return x.getTT().compareTo(y.getTT());
            }
        });
        list.get(0).setXh(1);
        for(int i=1;i<list.size();i++){
            if(list.get(i).getTT().equals(list.get(i-1).getTT())) list.get(i).setXh(list.get(i-1).getXH());
            else list.get(i).setXh(i+1);
        }
        for(Player x:list){
            System.out.println(x);
        }
    }
}
// 3
// Nguyen Van Thanh
// 20/03/1990
// 07:00:00
// 07:10:01
// Nguyen Hoa Binh
// 01/10/1993
// 07:02:00
// 07:11:20
// Le Thanh Van
// 15/03/1998
// 07:05:00
// 07:15:30
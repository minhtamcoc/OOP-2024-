import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(); 
        List<Time> list=new ArrayList<>();
        sc.nextLine();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String giovao=sc.nextLine();
            String giora=sc.nextLine();
            list.add(new Time(id,name,giovao,giora));
        }
        list.sort(new Comparator<Time>() {
            public int compare(Time x,Time y){
                if(x.getGiochoi()!=y.getGiochoi()) return Integer.compare(y.getGiochoi(),x.getGiochoi());
                return Integer.compare(y.getPhutchoi(),x.getPhutchoi());
            }
        });
        for(Time x:list){
            System.out.println(x);
        }
    }
}
// 3
// 01T
// Nguyen Van An
// 09:00
// 10:30
// 06T
// Hoang Van Nam
// 15:30
// 18:00
// 02I
// Tran Hoa Binh
// 09:05
// 10:00
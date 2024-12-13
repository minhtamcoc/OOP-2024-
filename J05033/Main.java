import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<ThoiGian> list=new ArrayList<>();
        while(n-->0){
            int gio=sc.nextInt();
            int phut=sc.nextInt();
            int giay=sc.nextInt();

            list.add(new ThoiGian(gio,phut,giay));
        }
        list.sort(new Comparator<ThoiGian>() {
            public int compare(ThoiGian x,ThoiGian y){
                if(x.getGio()!=y.getGio()) return Integer.compare(x.getGio(),y.getGio());
                if(x.getPhut()!=y.getPhut()) return Integer.compare(x.getPhut(),y.getPhut());
                return Integer.compare(x.getGiay(),y.getGiay());
            }
        });
        for(ThoiGian x:list){
            System.out.println(x);
        }
    }
}
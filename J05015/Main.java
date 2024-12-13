import java.text.ParseException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc=new Scanner(System.in);
        List<Dua> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name=sc.nextLine();
            String donvi=sc.nextLine();
            String end=sc.nextLine();
            list.add(new Dua(name,donvi,end));
        }
        list.sort(new Comparator<Dua>() {
            public int compare(Dua x,Dua y){
                return Double.compare(x.getTT(),y.getTT());
            }
        });
        for(Dua x:list){
            System.out.println(x);
        }
    }
}
// 3
// Tran Vu Minh
// Ha Noi
// 8:30
// Vu Ngoc Hoang
// Hoa Binh
// 8:20
// Pham Dinh Tan
// An Giang
// 8:45
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File f=new File("BANGDIEM.in");
        Scanner sc=new Scanner(f);
        List<Diem> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String name=sc.nextLine().toLowerCase().trim();
            int m1=Integer.parseInt(sc.nextLine().trim());
            int m2=Integer.parseInt(sc.nextLine().trim());
            int m3=Integer.parseInt(sc.nextLine().trim());
            list.add(new Diem(name,m1,m2,m3));
        }
        list.sort(new Comparator<Diem>() {
            public int compare(Diem x,Diem y){
                return Double.compare(y.getDiem(),x.getDiem());
            }
        });
        for(Diem x:list){
            System.out.println(x);
        }
    }
}
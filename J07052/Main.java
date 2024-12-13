import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File f=new File("THISINH.in");
        Scanner sc=new Scanner(f);
        List<ThiSinh> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine().toLowerCase().trim();
            double toan=Double.parseDouble(sc.nextLine());
            double l=Double.parseDouble(sc.nextLine());
            double h=Double.parseDouble(sc.nextLine());
            list.add(new ThiSinh(id, name, toan, l, h));
        }
        list.sort(new Comparator<ThiSinh>() {
            public int compare(ThiSinh x,ThiSinh y){
                if(x.getTong()==y.getTong()){
                    return x.getId().compareTo(y.getId());
                }
                return Double.compare(y.getTong(),x.getTong());
            }
        });
        int n=Integer.parseInt(sc.nextLine());
        double diemchuan=list.get(n-1).getTong();
        for(ThiSinh x:list){
            if(x.getTong()>=diemchuan){
                x.setStatus("TRUNG TUYEN");
            }
            else{
                x.setStatus("TRUOT");
            }
        }
        System.out.printf("%.1f",diemchuan);
        System.out.println();
        for(ThiSinh x:list){
            System.out.println(x);
        }
    }
}
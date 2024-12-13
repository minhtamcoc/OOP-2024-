import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File f=new File("KHACHHANG.in");
        Scanner sc=new Scanner(f);
        List<TienDien> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String name=sc.nextLine().toLowerCase().trim();
            String line=sc.nextLine().trim();
            String[] arr=line.split("\\s+");
            String loai=arr[0];
            int d=Integer.parseInt(arr[1]);
            int c=Integer.parseInt(arr[2]);
            list.add(new TienDien(name,loai,d,c));
        }
        list.sort(new Comparator<TienDien>() {
            public int compare(TienDien x,TienDien y){
                return Integer.compare(y.getTong(),x.getTong());
            }
        });
        for(TienDien x:list){
            System.out.println(x);
        }
    }
}
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File f=new File("THISINH.in");
        Scanner sc=new Scanner(f);
        List<ThiSinh> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String name=sc.nextLine().toLowerCase().trim();
            double Diem=Double.parseDouble(sc.nextLine());
            String Dantoc=sc.nextLine();
            int khuvuc=Integer.parseInt(sc.nextLine().trim());
            list.add(new ThiSinh(name,Diem,Dantoc,khuvuc));
        }
        list.sort(new Comparator<ThiSinh>() {
            public int compare(ThiSinh x,ThiSinh y){
                if(x.getDiem()==y.getDiem()){
                    return x.getId().compareTo(y.getId());
                }
                return Double.compare(y.getDiem(),x.getDiem());
            }
        });
        for(ThiSinh x:list){
            System.out.println(x);
        }
    }
}
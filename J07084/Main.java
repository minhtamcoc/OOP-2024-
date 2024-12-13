import java.util.*;
import java.io.*;
import java.text.ParseException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException,ParseException{
        File f=new File("ONLINE.in");
        Scanner sc=new Scanner(f);
        List<ThoiGian> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String name=sc.nextLine();
            String start=sc.nextLine();
            String end=sc.nextLine();
            list.add(new ThoiGian(name,start,end));
        }
        list.sort(new Comparator<ThoiGian>() {
            public int compare(ThoiGian x,ThoiGian y){
                if(x.getT()==y.getT()) return x.getName().compareTo(y.getName());
                return Long.compare(y.getT(),x.getT());
            }
        });
        for(ThoiGian x:list){
            System.out.println(x);
        }
    }
}
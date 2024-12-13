import  java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File f=new File("XETTUYEN.in");
        Scanner sc=new Scanner(f);
        List<XetTuyen> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String name=sc.nextLine().toLowerCase().trim();
            String year=sc.nextLine();
            double lt=Double.parseDouble(sc.nextLine());
            double th=Double.parseDouble(sc.nextLine());
            list.add(new XetTuyen(name, year, lt, th));
        }
        for(XetTuyen x:list){
            System.out.println(x);
        }
    }
}

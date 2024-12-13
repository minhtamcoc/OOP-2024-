import java.util.*;
import java.io.*;
import java.text.ParseException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException,ParseException{
        File f=new File("SINHVIEN.in");
        Scanner sc=new Scanner(f);
        List<SinhVien> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String name=sc.nextLine().toLowerCase().trim();
            String lop=sc.nextLine();
            String birth=sc.nextLine();
            double a=Double.parseDouble(sc.nextLine());
            list.add(new SinhVien(name, lop, birth, a));
        }
        for(SinhVien x:list){
            System.out.println(x);
        }
    }
}
import java.util.*;
import java.io.*;
import java.text.ParseException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException ,ParseException {
        File f=new File("SV.in");
        Scanner sc=new Scanner(f);
        int t=Integer.parseInt(sc.nextLine());
        List<SinhVien> list=new ArrayList<>();
        while(t-->0) {
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String year = sc.nextLine();
            double Gpa = Double.parseDouble(sc.nextLine());
            System.out.println(new SinhVien(name,lop,year,Gpa));
        }
    }
}

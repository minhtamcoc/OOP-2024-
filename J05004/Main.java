import java.util.*;
import java.io.*;
import java.text.ParseException;
public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc=new Scanner(System.in);
        List<SinhVien> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            String name=sc.nextLine().toLowerCase().trim();
            String lop=sc.nextLine();
            String age=sc.nextLine();
            double GPA=sc.nextDouble();
            sc.nextLine();
            list.add(new SinhVien(name,lop,age,GPA));
            t--;
        }
        for(SinhVien x:list){
            System.out.println(x);
        }
    }
}
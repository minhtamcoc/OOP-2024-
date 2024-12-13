import java.text.ParseException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String lop=sc.nextLine();
        String age=sc.nextLine();
        double Gpa=sc.nextDouble();
        SinhVien x=new SinhVien(name,lop,age,Gpa);
        System.out.println(x);
    }
    
}
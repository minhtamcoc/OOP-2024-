import java.text.ParseException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc=new Scanner(System.in);
        List<SinhVien> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name=sc.nextLine().toLowerCase().trim();
            String lop=sc.nextLine();
            String age=sc.nextLine();;
            double GPA=sc.nextDouble();
            sc.nextLine();
            list.add(new SinhVien(age,name,lop,age,GPA));
        }
        list.sort(new Comparator<SinhVien>() {
            public int compare(SinhVien x,SinhVien y){
                return Double.compare(y.getGpa(),x.getGpa());
            }
        });
        for(SinhVien x:list){
            System.out.println(x);
        }
    }
}
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File f=new File("SINHVIEN.in");
        List<SinhVien> list=new ArrayList<>();
        Scanner sc=new Scanner(f);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String phone=sc.nextLine();
            String mail=sc.nextLine();
            list.add(new SinhVien(id, name, phone, mail));
        }
        list.sort(new Comparator<SinhVien>() {
            public int compare(SinhVien x,SinhVien y){
                if(x.getName().equals(y.getName())){
                    return x.getID().compareTo(y.getID());
                }
                if(x.getTen().equals(y.getTen())){
                    return x.getHodem().compareTo(y.getHodem());
                }
                return x.getTen().compareTo(y.getTen());
            }
        });
        for(SinhVien x:list){
            System.out.println(x);
        }
    }
}
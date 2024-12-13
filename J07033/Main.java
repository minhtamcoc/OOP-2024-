import java.util.*;
import java.io.*;
public class Main {
    public static String res(String s){
       String[] ar=s.split("\\s+");
       StringBuilder sb = new StringBuilder();
       for(String x:ar) {
           if (!x.isEmpty()) {
               x = x.toLowerCase();
               char tmp = Character.toUpperCase(x.charAt(0));
               sb.append(tmp).append(x.substring(1)).append(" ");
           }
       }
       return sb.toString().trim();
    }
    public static void main(String[] args) {
        File f=new File("SINHVIEN.in");
        try{
            Scanner sc=new Scanner(f);
            List<SinhVien> list=new ArrayList<>();
            int t=Integer.parseInt(sc.nextLine());
            while(t-->0){
                String id=sc.nextLine();
                String name=sc.nextLine();
                name= res(name);
                String lop=sc.nextLine();
                String mail=sc.nextLine();
                list.add(new SinhVien(id,name,lop,mail));
            }
            list.sort(new Comparator<SinhVien>() {
                public int compare(SinhVien o1, SinhVien o2) {
                    return o1.getId().compareTo(o2.getId());
                }
            });
            for(SinhVien sv:list){
                System.out.println(sv);
            }
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}

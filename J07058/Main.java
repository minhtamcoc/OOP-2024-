import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File f=new File("MONHOC.in");
        Scanner sc=new Scanner(f);
        List<MonHoc> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String id=sc.nextLine().trim();
            String name=sc.nextLine().trim();
            String hinhthuc=sc.nextLine().trim();
            list.add(new MonHoc(id,name,hinhthuc));
        }
        list.sort(new Comparator<MonHoc>() {
            public int compare(MonHoc x,MonHoc y){
                return x.getId().compareTo(y.getId());
            }
        });
        for(MonHoc x:list){
            System.out.println(x);
        }
    }   
}
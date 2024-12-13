import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<SinhVien> list=new ArrayList<>();
        while(sc.hasNext()){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String lop=sc.nextLine();
            String mail=sc.nextLine();
            list.add(new SinhVien(id,name,lop,mail));
        }
        list.sort(new Comparator<SinhVien>() {
            public int compare(SinhVien x,SinhVien y){
             return x.getId().compareTo(y.getId());
            }
        });
        for(SinhVien x:list){
            System.out.println(x);
        }
    }
}
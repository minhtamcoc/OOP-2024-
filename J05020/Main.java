import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<SinhVien> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String lop=sc.nextLine();
            String mail=sc.nextLine();
            list.add(new SinhVien(id,name,lop,mail));
        }
        list.sort(new Comparator<SinhVien>() {
            public int compare(SinhVien x,SinhVien y){
                if(x.getLop().equals(y.getLop())) return x.getId().compareTo(y.getId());
                return x.getLop().compareTo(y.getLop());
            }
        });
        for(SinhVien x:list){
            System.out.println(x);
        }
    }
}
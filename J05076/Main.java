import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Hang> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String xeploai=sc.nextLine();
            list.add(new Hang(id,name,xeploai));
        }
        List<DanhSach> l=new ArrayList<>();
        int q=sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String code=sc.next();
            int slnhap=sc.nextInt();
            int dongianhap=sc.nextInt();
            int soluongxuat=sc.nextInt();
            for(Hang x:list){
                if(x.getId().equals(code)){
                    l.add(new DanhSach(x.getId(),x.getName(),x.getXL(), slnhap, dongianhap, soluongxuat));
                }
            }
        }
        for(DanhSach x:l){
            System.out.println(x);
        }
    }
}
// 2
// A001
// Tu lanh
// A
// P002
// May giat
// B
// 3
// A001 500 100 300
// P002 1000 1000 500
// A001 600 1000 200
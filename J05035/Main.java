import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<ThucTap> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String lop=sc.nextLine();
            String mail=sc.nextLine();
            String Dn=sc.nextLine();
            list.add(new ThucTap(id,name,lop,mail,Dn));
        }
        list.sort(new Comparator<ThucTap>() {
            public int compare(ThucTap x,ThucTap y){
                return x.getId().compareTo(y.getId());
            }
        });
        int q=sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String s=sc.nextLine();
            for(ThucTap x:list){
                if(x.getDN().equals(s)) System.out.println(x);
            }
        }
    }
}
// 6
// B17DCCN016 
// Le Khac Tuan Anh 
// D17HTTT2   
// test1@stu.ptit.edu.vn
// VIETTEL
// B17DCCN107 
// Dao Thanh Dat    
// D17CNPM5   
// test2@stu.ptit.edu.vn
// FPT
// B17DCAT092 
// Cao Danh Huy     
// D17CQAT04-B
// test3@stu.ptit.edu.vn
// FPT
// B17DCCN388 
// Cao Sy Hai Long  
// D17CNPM2   
// test4@stu.ptit.edu.vn
// VNPT
// B17DCCN461 
// Dinh Quang Nghia 
// D17CNPM2   
// test5@stu.ptit.edu.vn
// FPT
// B17DCCN554 
// Bui Xuan Thai    
// D17CNPM1   
// test6@stu.ptit.edu.vn
// GAMELOFT
// 1
// FPT
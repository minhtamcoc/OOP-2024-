import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<SinhVien> list1=new ArrayList<>();
        int m=sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String phone=sc.nextLine();
            String sttN=sc.nextLine();
            list1.add(new SinhVien(id,name,phone,sttN));
        }
        List<BaiTap> list2=new ArrayList<>();
        while(m-->0){
            String nameBT=sc.nextLine();
            list2.add(new BaiTap(nameBT));
        }
       for(SinhVien x:list1){
            for(BaiTap y:list2){
                if(x.getSTTN().equals(y.getIDBT())){
                    x.setNameBT(y.getNameBT());
                    break;
                }
            }
       }
       list1.sort(new Comparator<SinhVien>() {
            public int compare(SinhVien x,SinhVien y){
                return x.getID().compareTo(y.getID());
            }
       });
       for(SinhVien x:list1){
        System.out.println(x);
       }
    }
}
// 5 2
// B17DTCN001
// Nguyen Chi  Linh
// 0987345543
// 1
// B17DTCN011
// Vu Viet Thang
// 0981234567
// 1
// B17DTCN023
// Pham Trong Thang
// 0992123456
// 1
// B17DTCN022
// Nguyen Van  Quyet
// 0977865432
// 2
// B17DTCN031
// Ngo Thanh Vien
// 0912313111
// 2
// Xay dung website ban dien thoai truc tuyen
// Xay dung ung dung quan ly benh nhan Covid-19
// 1
// 1
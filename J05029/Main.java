import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<DoanhNghiep> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            int sl=sc.nextInt();
            sc.nextLine();
            list.add(new DoanhNghiep(id,name,sl));
        }
        list.sort(new Comparator<DoanhNghiep>() {
            public int compare(DoanhNghiep x,DoanhNghiep y){
                if(x.getSL()==y.getSL()) return x.getID().compareTo(y.getID());
                return Integer.compare(y.getSL(),x.getSL());
            }
        });
        int q=sc.nextInt();
        while(q-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+a+" DEN "+b+" SINH VIEN:");
            for(DoanhNghiep x:list){
                if(x.getSL()>=a&&x.getSL()<=b){
                    System.out.println(x);
                }
            }
        }
    }
}
// 4
// VIETTEL
// TAP DOAN VIEN THONG QUAN DOI VIETTEL
// 40
// FSOFT
// CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
// 300
// VNPT
// TAP DOAN BUU CHINH VIEN THONG VIET NAM
// 200
// SUN
// SUN*
// 50
// 1
// 30 50
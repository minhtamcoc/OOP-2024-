import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<DoanhNgiep> list= new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            int sl=sc.nextInt();
            sc.nextLine();
            list.add(new DoanhNgiep(id,name,sl));
        }
        list.sort(new Comparator<DoanhNgiep>() {
            public int compare(DoanhNgiep x,DoanhNgiep y){
                if(x.getSL()==y.getSL()) return x.getID().compareTo(y.getID());
                return Integer.compare(y.getSL(),x.getSL());
            }
        });
        for(DoanhNgiep x:list){
            System.out.println(x);
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
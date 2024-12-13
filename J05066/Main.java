import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<NhanVien> list=new ArrayList<>();
        int t=sc.nextInt();
        int re1=0;
        int re2=0;
        int re3=0;
        while(t-->0){
            String id=sc.next();
            String name=sc.nextLine().trim();
            if(id.substring(0,2).equals("GD")){
                if(re1<1){
                    list.add(new NhanVien(id,name));
                    re1++;
                }
                else{
                    StringBuilder ss=new StringBuilder(id);
                    ss.setCharAt(0,'N');
                    ss.setCharAt(1,'V');
                    String tmp=ss.toString();
                    list.add(new NhanVien(tmp,name));
                }
            }
            if(id.substring(0,2).equals("TP")){
                if(re2<3){
                    list.add(new NhanVien(id,name));
                    re2++;
                }
                else{
                    StringBuilder ss=new StringBuilder(id);
                    ss.setCharAt(0,'N');
                    ss.setCharAt(1,'V');
                    String tmp=ss.toString();
                    list.add(new NhanVien(tmp,name));
                }
            }
            if(id.substring(0,2).equals("PP")){
                if(re3<3){
                    list.add(new NhanVien(id,name));
                    re3++;
                }
                else{
                    StringBuilder ss=new StringBuilder(id);
                    ss.setCharAt(0,'N');
                    ss.setCharAt(1,'V');
                    String tmp=ss.toString();
                    list.add(new NhanVien(tmp,name));
                }
            }
            if(id.substring(0,2).equals("NV")){
                list.add(new NhanVien(id,name));
            }
        }
        list.sort(new Comparator<NhanVien>() {
                public int compare(NhanVien x,NhanVien y){
                    if(x.getHeso().equals(y.getHeso())) return x.getSH().compareTo(y.getSH());
                    return y.getHeso().compareTo(x.getHeso());
                }
        });
        int q=sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String s=sc.nextLine().trim();
            for(NhanVien x:list){
                if(x.getName().toLowerCase().contains(s.toLowerCase())){
                    System.out.println(x);
                }
            }
          System.out.println();
        }
    }
}
// 7
// GD08001 Pham Minh Tam
// TP05002 Hoang Thanh Tuan
// TP05001 Tran Binh Nguyen
// PP06002 Phan Trung Tuan
// PP06001 Tran Quoc Huy
// NV04003 Vo Van Lan
// GD08001 Nguyen Kim Loan
// 2
// OA
// aM
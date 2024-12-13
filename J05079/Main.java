import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Lop> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String nhomlop=sc.nextLine();
            String tengiangvien=sc.nextLine();
            list.add(new Lop(id,name,nhomlop,tengiangvien));
        }
        list.sort(new Comparator<Lop>() {
            public int compare(Lop x,Lop y){
                return x.getNhom().compareTo(y.getNhom());
            }
        });
        int q=sc.nextInt();
        while(q-->0){
            String s=sc.next();
            int cnt=0;
            for(Lop x:list){
                if(x.getId().equals(s)){
                    if(cnt==0){
                        System.out.println("Danh sach nhom lop mon "+x.getName()+":");
                        cnt++;
                    }
                    System.out.println(x);
                }
            }
        }
    }
}
// 4
// THCS2D20
// Tin hoc co so 2 - D20
// 01
// Nguyen Binh An
// CPPD20
// Ngon ngu lap trinh C++ - D20
// 01
// Le Van Cong
// THCS2D20
// Tin hoc co so 2 - D20
// 02
// Nguyen Trung Binh
// LTHDTD19
// Lap trinh huong doi tuong - D19
// 01
// Nguyen Binh An
// 1
// THCS2D20
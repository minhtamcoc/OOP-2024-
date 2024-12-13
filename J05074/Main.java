import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<SinhVien> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        int n=t;
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String lop=sc.nextLine();
            list.add(new SinhVien(id,name,lop));
        }
        while(n-->0){
            String code=sc.next();
            String s=sc.next();
            int cnt=10;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='m') cnt-=1;
                else if(s.charAt(i)=='v') cnt-=2;
            }
            if(cnt<0) cnt=0;
            for(SinhVien x:list){
                if(x.getId().equals(code)){
                    x.setDiem(cnt);
                }
            }
        }
        for(SinhVien x:list){
            if(x.getD()!=0) System.out.println(x);
            else System.out.println(x+" KDDK");
        }
    }
}
// 3
// B19DCCN999
// Le Cong Minh
// D19CQAT02-B
// B19DCCN998
// Tran Truong Giang
// D19CQAT02-B
// B19DCCN997
// Nguyen Tuan Anh
// D19CQCN04-B
// B19DCCN998 xxxmxmmvmx
// B19DCCN997 xmxmxxxvxx
// B19DCCN999 xvxmxmmvvm
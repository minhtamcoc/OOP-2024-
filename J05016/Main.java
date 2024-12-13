import java.text.ParseException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc=new Scanner(System.in);
        List<KhachSan> list=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name=sc.nextLine().trim();
            String sophong=sc.nextLine().trim();
            String ngaynhan=sc.nextLine().trim();
            String ngaytra=sc.nextLine().trim();
            int dichvu=sc.nextInt();
            sc.nextLine();
            list.add(new KhachSan(name,sophong,ngaynhan,ngaytra,dichvu));
        }
        list.sort(new Comparator<KhachSan>() {
            public int compare(KhachSan x,KhachSan y){
                return Integer.compare(y.getTT(),x.getTT());
            }
        });
        for(KhachSan x:list){
            System.out.println(x);
        }
    }
}
// 3
// Huynh Van Thanh   
// 103 
// 05/06/2010   
// 05/06/2010   
// 15
// Le Duc Cong  
// 106 
// 08/03/2010   
// 01/05/2010   
// 220
// Tran Thi Bich Tuyen   
// 207 
// 10/04/2010   
// 21/04/2010   
// 96
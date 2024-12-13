import java.text.ParseException;
import java.util.*;
public class Main {
    public static void main(String[] args)throws ParseException {
        Scanner sc=new Scanner(System.in);
        List<CUOC> list1=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            long giacuoc=sc.nextLong();
            sc.nextLine();
            list1.add(new CUOC(id,name,giacuoc));
        }
        int q=sc.nextInt();
        List<GOI> list2=new ArrayList<>();
        while(q-->0){
            String thuebao=sc.next();
            String start=sc.next();
            String end=sc.next();
            if(thuebao.substring(0,1).equals("0")){
                String tmp=thuebao.substring(1,3);
                for(CUOC x:list1){
                    if(x.getID().equals(tmp)){
                        list2.add(new GOI(x.getID(),x.getName(),x.getGC(),thuebao,start,end));
                    }
                }
            }
            else{
                list2.add(new GOI(thuebao,"Noi mang",800,thuebao,start,end));
            }
        }
        list2.sort(new Comparator<GOI>() {
            public int compare(GOI x,GOI y){
                return Long.compare(y.getT(),x.getT());
            }
        });
        for(GOI x:list2){
            System.out.println(x);
        }
    }
}
// 2
// 53
// Da Nang
// 3000
// 64
// Vung Tau
// 1000
// 3
// 064-824531 11:20 11:22
// 8293567 09:07 09:15
// 053-823532 12:00 12:05
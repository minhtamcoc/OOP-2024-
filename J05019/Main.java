import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        TreeSet<String> st=new TreeSet<>();
        List<LuongMua> list=new ArrayList<>();
        sc.nextLine();
        while(t-->0){
            String name=sc.nextLine();
            String start=sc.nextLine();
            String end=sc.nextLine();
            long luongmua=sc.nextLong();
            sc.nextLine();
            SimpleDateFormat f=new SimpleDateFormat("hh:mm");
            long re1=f.parse(end).getTime()-f.parse(start).getTime();
            double re2=(double)re1/3600000;
            if(!st.contains(name)){
                st.add(name);
                list.add(new LuongMua(name,start,end,luongmua));
            }
            else{
                for(LuongMua x:list){
                    if(x.getName().equals(name)){
                        x.setTime(re2);
                        x.setLM(luongmua);
                    }
                }
            }
        }
        for(LuongMua x:list){
            System.out.print(x);
            System.out.printf("%.2f\n",x.getTB());
        }
    }
}
// 10
// Dong Anh
// 07:30
// 08:00
// 60
// Cau Giay
// 07:45
// 08:12
// 50
// Soc Son
// 08:00
// 09:15
// 78
// Dong Anh
// 18:50
// 20:00
// 88
// Cau Giay
// 19:01
// 20:00
// 77
// Soc Son
// 19:06
// 20:21
// 66
// Dong Anh
// 21:00
// 21:40
// 49
// Cau Giay
// 21:50
// 22:20
// 68
// Dong Anh
// 22:15
// 23:45
// 30
// Cau Giay
// 22:50
// 23:45
// 35
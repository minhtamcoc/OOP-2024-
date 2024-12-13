import java.util.*;
public class J03004 {
    public static String chuanhoa(String s){
        String[] arr=s.split("\\s+");
        StringBuilder ss=new StringBuilder();
        for(String x:arr){
            if(!x.isEmpty()){
                char tmp=Character.toUpperCase(x.charAt(0));
                ss.append(tmp).append(x.substring(1)).append(" ");
            }
        }
        return ss.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name=sc.nextLine();
            name=name.toLowerCase().trim();
            System.out.println(chuanhoa(name));
        }
    }
}

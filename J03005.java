import java.util.*;
public class J03005 {
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
            name=chuanhoa(name.toLowerCase().trim());
            String[] arr=name.split(" ");
            for(int i=1;i<arr.length-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.print(arr[arr.length-1]+", ");
            System.out.println(arr[0].toUpperCase());
        }
    }
}

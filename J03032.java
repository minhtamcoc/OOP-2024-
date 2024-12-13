import java.util.*;
public class J03032 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            String[] ss=s.split(" ");
            for(String x:ss){
                StringBuilder res=new StringBuilder(x);
                System.out.print(res.reverse().toString()+" ");
            }
            System.out.println();
        }
    }
}

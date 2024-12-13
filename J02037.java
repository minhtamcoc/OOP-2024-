import java.util.*;
public class J02037 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
           String s=sc.nextLine();
           String[] ss=s.split(" ");
           int re1=0;
           int re2=0;
           int n=0;
           for(String x:ss){
            int tmp=Integer.parseInt(x);
            if(tmp%2==0) re1++;
            else re2++;
            n++;
           }
           if(n%2==0&&(re1>re2)) System.out.println("YES");
           else if(n%2==1&&(re1<re2)) System.out.println("YES");
           else System.out.println("NO");
        }
    }
}

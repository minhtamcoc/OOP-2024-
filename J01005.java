import java.text.DecimalFormat;
import java.util.*;
public class J01005 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t>0){
        int n,h;
        n=sc.nextInt();
        h=sc.nextInt();
        DecimalFormat f=new DecimalFormat("0.000000");
        for(int i=1;i<=n-1;i++){
            System.out.print(f.format(h*Math.sqrt((double)i/n))+" ");
        }
        System.out.println();
        t--;
    }
    }
}

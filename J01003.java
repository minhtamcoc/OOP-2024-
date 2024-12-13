import java.text.DecimalFormat;
import java.util.*;
public class J01003 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b;
        a=sc.nextDouble();
        b=sc.nextDouble();
        if(a==0){
            if(b==0){
                System.out.println("VSN");
            }
            else System.out.println("VN");
        }
        else{
            double tmp=-b/a;
            System.out.printf("%.2f",tmp);
        }
    }
}

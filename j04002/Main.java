import java.text.DecimalFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double width =sc.nextDouble();
        double height=sc.nextDouble();
        String color=sc.next();
        int H=(int) height;
        int W=(int) width;
        if(W!=width||H!=height||width<=0||height<=0) System.out.println("INVALID");
        else{
            HinhChuNhat x=new HinhChuNhat(width,height,color);
           System.out.println((int)x.findPerimeter()+" "+(int)x.findArea()+" "+x.getColor());
        }
    }
}
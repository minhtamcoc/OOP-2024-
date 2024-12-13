import java.util.*;
import java.text.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            double x1=sc.nextDouble();
            double y1=sc.nextDouble();
            double x2=sc.nextDouble();
            double y2=sc.nextDouble();
            double x3=sc.nextDouble();
            double y3=sc.nextDouble();
            Point A=new Point(x1,y1);
            Point B=new Point(x2,y2);
            Point C=new Point(x3,y3);
            double AB=A.distance(B);
            double AC=A.distance(C);
            double BC=B.distance(C);
            double p= AB+AC+BC;
            if(AB+BC>AC&&AB+AC>BC&&BC+AC>AB){
                DecimalFormat f=new DecimalFormat("#.000");
                double re1=(double)(Math.round(p*1000))/1000;
                System.out.println(f.format(re1));
            }
            else System.out.println("INVALID");
        }
    }
}
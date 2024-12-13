import java.text.DecimalFormat;
import java.util.*;
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
            double p=(AB+AC+BC)/2;
            if(AB+BC>AC&&AB+AC>BC&&BC+AC>AB){
                double re1=p*(p-AB)*(p-AC)*(p-BC);
                double S=Math.sqrt(re1);
                double R=(AB*AC*BC)/(4*S);
                double ST=Math.PI*R*R;
                double re2=(double)Math.round(ST*1000)/1000;
                DecimalFormat f=new DecimalFormat("#.000");
                System.out.println(f.format(ST));
            }
            else System.out.println("INVALID");
        }
    }
}

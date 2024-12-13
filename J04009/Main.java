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
            double p= (AB+AC+BC)/2;
            if(AB+AC>BC&&AB+BC>AC&&BC+AC>AB){
                double re=Math.sqrt(p*(p-AB)*(p-AC)*(p-BC));
                double re1=(double)(Math.round(re*100))/100;
                DecimalFormat f=new DecimalFormat("#.00");
                System.out.println(f.format(re1));
            }
            else System.out.println("INVALID");
        }
    }
}
// 3
// 0 0 0 5 0 199
// 1 1 1 1 1 1
// 0 0 0 5 5 0
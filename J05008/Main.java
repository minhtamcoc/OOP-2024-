import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            List<Point> list=new ArrayList<>();
            for(int i=1;i<=n;i++){
                double x=sc.nextDouble();
                double y=sc.nextDouble();
                list.add(new Point(x,y));
            }
            Point p1=list.get(0);
            double S=0;
            for(int i=1;i<n-1;i++){
                S+=p1.dientich(list.get(i),list.get(i+1));
            }
          double re=(double)(Math.round(S*1000))/1000;
          System.out.printf("%.3f\n",re);
        }
    }
}
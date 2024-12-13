public class Point {
    private double x;
    private double y;
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(Point p){
        double re1=(x-p.getX())*(x-p.getX());
        double re2=(y-p.getY())*(y-p.getY());
        return Math.sqrt(re1+re2);
    }
    public double dientich(Point B,Point C){
        double AB=distance(B);
        double AC=distance(C);
        double BC=B.distance(C);
        double p=(AB+AC+BC)/2;
        double s=Math.sqrt(p*(p-AB)*(p-AC)*(p-BC));
        return s;
    }
}

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
}

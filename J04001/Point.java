public class Point {
    private double x;
    private double y;
    public Point(){
    }
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
    public double distance1(Point secondPoint){
        double re=(x-secondPoint.getX())*(x-secondPoint.getX());
        double re1=(y-secondPoint.getY())*(y-secondPoint.getY());
        return Math.sqrt(re+re1);
    }
    public double distance2(Point p1,Point p2){
        double re=(p1.getX()-p2.getX())*(p1.getX()-p2.getX());
        double re1=(p1.getY()-p2.getY())*(p1.getY()-p2.getY());
        return Math.sqrt(re+re1);
    }
}

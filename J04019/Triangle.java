public class Triangle {
    private Point A;
    private Point B;
    private Point C;
    public Triangle(Point A,Point B,Point C){
        this.A=A;
        this.B=B;
        this.C=C;
    }
    public boolean valid(){
        double k=A.distance(B);
        double m=A.distance(C);
        double n=B.distance(C);
        if(k+m>n&&k+n>m&&n+m>k) return true;
        return false;
    }
    public double getPerimeter(){
        double tmp=A.distance(B)+A.distance(C)+B.distance(C);
        double re=(double)(Math.round(tmp*1000))/1000;
        return re;
    }
}

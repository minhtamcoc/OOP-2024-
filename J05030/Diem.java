public class Diem {
    private String id;
    private String name;
    private String lop;
    private double m1;
    private double m2;
    private double m3;
    public Diem(String id,String name,String lop,double m1,double m2,double m3){
        this.id=id;
        this.name=name;
        this.lop=lop;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    public String getId(){
        return id;
    }
    public String toString(){
        return id+" "+name+" "+lop+" "+String.format("%.1f",m1)+" "+String.format("%.1f",m2)+" "+String.format("%.1f",m3);
    }
}

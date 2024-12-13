public class SinhVien {
    static int idx=0;
    private String id;
    private String name;
    private String age;
    private double m1;
    private double m2;
    private double m3;
    private double tong;
    public SinhVien(String name,String age,double m1,double m2,double m3){
        idx++;
        this.id=String.format("%d",idx);
        this.name=name;
        this.age=age;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.tong=this.m1+this.m2+this.m3;
    }
    public String getId(){
        return id;
    }
    public double getTong(){
        return tong;
    }
    public String toString(){
        return id+" "+name+" "+age+" "+tong;
    }
}

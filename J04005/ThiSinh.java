public class ThiSinh {
    private String name;
    private String age;
    private float m1;
    private float m2;
    private float m3;
    private float tong;
    public ThiSinh(String name,String age,float m1,float m2,float m3){
        this.name=name;
        this.age=age;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.tong=this.m1+this.m2+this.m3;
    }
    public String toString(){
        return name+" "+age+" "+String.format("%.1f",tong);
    }
}

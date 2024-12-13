public class HocSinh {
    static int idx=0;
    private String id;
    private String name;
    private double x1;
    private double x2;
    private double x3;
    private double x4;
    private double x5;
    private double x6;
    private double x7;
    private double x8;
    private double x9;
    private double x10;
    private double tong;
    private String status;
    public HocSinh(String name,double x1,double x2,double x3,double x4,double x5,double x6,double x7,double x8,double x9,double x10){
        idx++;
        this.id="HS"+String.format("%02d",idx);
        this.name=name;
        this.x1=x1;
        this.x2=x2;
        this.x3=x3;
        this.x4=x4;
        this.x5=x5;
        this.x6=x6;
        this.x7=x7;
        this.x8=x8;
        this.x9=x9;
        this.x10=x10;
        this.tong=(this.x1*2+this.x2*2+this.x3+this.x4+this.x5+this.x6+this.x7+this.x8+this.x9+this.x10)/12;
        if(this.tong>=9){
            this.status="XUAT SAC";
        }
        else if(this.tong>=8&&this.tong<=8.9){
            this.status="GIOI";
        }
        else if(this.tong>=7&&this.tong<=7.9){
            this.status="KHA";
        }
        else if(this.tong>=5&&this.tong<=6.9){
            this.status="TB";
        }
        else this.status="YEU";
    }
    public double getTong(){
        return tong;
    }
    public String getId(){
        return id;
    }
    public String toString(){
        return id+" "+name+" "+String.format("%.1f",Math.round(tong*10.0)/10.0)+" "+status;
    }
}


public class NhanVien {
    static int idx=0;
    private String id;
    private String name;
    private double lythuyet;
    private double thuchanh;
    private double tong;
    private String status;
    private double xuly(double x){
        if(x>10) return x/10;
        return x;
    }
    public NhanVien(String name,double lythuyet,double thuchanh){
        idx++;
        this.id="TS"+String.format("%02d",idx);
        this.name=name;
        this.lythuyet=xuly(lythuyet);
        this.thuchanh=xuly(thuchanh);
        this.tong=(this.lythuyet+this.thuchanh)/2;
        if(this.tong>9.5){
            this.status="XUAT SAC";
        }
        else if(this.tong>=8){
            this.status="DAT";
        }
        else if(this.tong>=5){
            this.status="CAN NHAC";
        }
        else this.status="TRUOT";
    }
    public double getTong(){
        return tong;
    }
    public String toString(){
        return id+" "+name+" "+String.format("%.2f",tong)+" "+status;
    }
}

public class Hang {
    static int idx=0;
    private String id;
    private String name;
    private String dv;
    private long  gianhap;
    private long sl;
    private long  phivanchuyen;
    private long thanhtien;
    private long giaban;
    public Hang(String name,String dv,long gianhap,long sl){
        idx++;
        this.id="MH"+String.format("%02d",idx);
        this.name=name;
        this.dv=dv;
        this.gianhap=gianhap;
        this.dv=dv;
        double tmp=gianhap*sl*0.05;
        double re=gianhap*sl+tmp;
        double re1=(re+0.02*re)/sl;
        this.phivanchuyen=Math.round(tmp);
        this.thanhtien=Math.round(re);
        this.giaban=(long)Math.ceil(re1*0.01)*100;
    }
    public long getGiaBan(){
        return giaban;
    }
    public String toString(){
        return id+" "+name+" "+dv+" "+phivanchuyen+" "+thanhtien+" "+giaban;
    }
}

public class Hang {
    static int idx=0;
    private String id;
    private String name;
    private String donvi;
    private double gianhap;
    private double sl;
    private long phivanchuyen;
    private long  thanhtien;
    private long giaban;
    public Hang(String name,String donvi,double gianhap,double sl){
        idx++;
        this.id="MH"+String.format("%02d",idx);
        this.name=name;
        this.donvi=donvi;
        this.gianhap=gianhap;
        this.sl=sl;
        double tmp=gianhap*sl*0.05;
        double re1=gianhap*sl+tmp;
        double re2=re1+0.02*re1;
        this.phivanchuyen=Math.round(tmp);
        this.thanhtien=Math.round(re1);
        this.giaban=Math.round(re2);
    }
    public String toString(){
        return id+" "+name+" "+donvi+" "+phivanchuyen+" "+thanhtien+" "+giaban;
    }
}

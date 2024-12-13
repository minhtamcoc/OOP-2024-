public class HoaDon {
    static int idx=0;
    private String idHD;
    private String maloai;
    private long soluong;
    private String nameSP;
    private long giamgia;
    private long thanhtien;
    private long dongia;
    public HoaDon(String maloai,long soluong,String nameSP,long dongia){
        idx++;
        this.nameSP=nameSP;
        this.dongia=dongia;
        this.maloai=maloai;
        this.idHD=this.maloai+"-"+String.format("%03d",idx);
        this.soluong=soluong;
        long tmp=this.soluong*this.dongia;
        if(this.soluong>=150){
            this.giamgia=(long)(0.5*tmp);
        }
        else if(this.soluong>=100){
            this.giamgia=(long)(0.3*tmp);
        }
        else if(this.soluong>=50){
            this.giamgia=(long)(0.15*tmp);
        }
        this.thanhtien=tmp-this.giamgia;
    }
    public String toString(){
        return idHD+" "+nameSP+" "+giamgia+" "+thanhtien;
    }
}

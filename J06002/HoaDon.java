public class HoaDon {
    static int idx=0;
    private String id;
    private String nameSP;
    private String maloai;
    private long soluong;
    private long giamgia;
    private long thanhtien;
    private long dongia;
    public HoaDon(String maloai,long soluong,String nameSP,long dongia){
        idx++;
        this.id=maloai+"-"+String.format("%03d",idx);
        this.maloai=maloai;
        this.nameSP=nameSP;
        this.dongia=dongia;
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
    public long getT(){
        return thanhtien;
    }
    public String toString(){
        return id+" "+nameSP+" "+giamgia+" "+thanhtien;
    }
}

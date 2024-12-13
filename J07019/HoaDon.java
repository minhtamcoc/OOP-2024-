public class HoaDon extends SanPham {
    static int idx=0;
    private String idHD;
    private long soluong;
    private long discount;
    private long thanhtien;
    public HoaDon(String idS,String nameS,long dongia1,long dongia2,String idHD,long soluong){
        super(idS,nameS,dongia1,dongia2);
        idx++;
        this.idHD=idHD+String.format("-%03d",idx);
        this.soluong=soluong;
        String re=idHD.substring(2,3);
        long tmp=0;
        if(re.equals("1")){
            tmp=getDG1()*this.soluong;
        }
        else if(re.equals("2")){
            tmp=getDG2()*this.soluong;
        }
        if(this.soluong>=150){
            this.discount=(long)(0.5*tmp);
        }
        else if(this.soluong>=100){
            this.discount=(long)(0.3*tmp);
        }
        else if(this.soluong>=50){
            this.discount=(long)(0.15*tmp);
        }
        this.thanhtien=tmp-this.discount;
    }
    public String toString(){
        return idHD+" "+getNames()+" "+discount+" "+thanhtien;
    }
}

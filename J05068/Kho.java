public class Kho {
    private String id;
    private String hsx;
    private long soluong;
    private long dongia;
    private long thue;
    private long tien;
    private long thanhtien;
    public Kho(String id,long soluong){
        this.id=id;
        this.hsx=hsx;
        this.soluong=soluong;
        String re1=id.substring(3);
        if(re1.equals("BP")) this.hsx="British Petro";
        else if(re1.equals("ES")) this.hsx="Esso";
        else if(re1.equals("SH")) this.hsx="Shell";
        else if(re1.equals("CA")) this.hsx="Castrol";
        else if(re1.equals("MO")) this.hsx="Mobil";
        else if(re1.equals("TN")) this.hsx="Trong Nuoc";
        String re2=id.substring(0,1);
        if(re2.equals("X")){
            this.dongia=128000;
            this.tien=this.soluong*this.dongia;
            this.thue=(long)(this.tien*0.03);
        }
        else if(re2.equals("D")){
            this.dongia=11200;
            this.tien=this.soluong*this.dongia;
            this.thue=(long)(this.tien*0.035);
        }
        else if(re2.equals("N")){
            this.dongia=9700;
            this.tien=this.soluong*this.dongia;
            this.thue=(long)(this.tien*0.02);
        }
        if(re1.equals("TN")){
            this.thue=0;
        }
        this.thanhtien=this.tien+this.thue;
    }
    public long getT(){
        return thanhtien;
    }
    public String toString(){
        return id+" "+hsx+" "+dongia+" "+thue+" "+thanhtien;
    }
}

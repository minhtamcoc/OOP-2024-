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
        String re1=id.substring(3,5);
        this.soluong=soluong;
        if(re1.equals("BP")) this.hsx="British Petro";
        else if(re1.equals("ES")) this.hsx="Esso";
        else if(re1.equals("SH")) this.hsx="Shell";
        else if(re1.equals("CA")) this.hsx="Castrol";
        else if(re1.equals("MO")) this.hsx="Mobil";
        else if(re1.equals("TN")) this.hsx="Trong Nuoc";
        String re2=id.substring(0, 1);
        if(re2.equals("X")){
            this.dongia=128000;
            this.tien=this.dongia*this.soluong;
            double tmp=0.03*this.tien;
            this.thue=(long) tmp;
        }
        else if(re2.equals("D")){
            this.dongia=11200;
            this.tien=this.dongia*this.soluong;
            double tmp=0.035*this.tien;
            this.thue=(long) tmp;
        }
        else if(re2.equals("N")){
            this.dongia=9700;
            this.tien=this.dongia*this.soluong;
            double tmp=0.02*this.tien;
            this.thue=(long) tmp;
        }
        if(re1.equals("TN")) this.thue=0;
        this.thanhtien=this.tien+this.thue;
    }
    public String toString(){
        return id+" "+hsx+" "+dongia+" "+thue+" "+thanhtien;
    }
}

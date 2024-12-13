public class Lop {
    static int idx=0;
    private String idN;
    private String idM;
    private int day;
    private int kip;
    private String giangvien;
    private String phonghoc;
    public Lop(String idM,int day,int kip,String giangvien,String phonghoc){
        idx++;
        this.idN="HP"+String.format("%03d",idx);
        this.idM=idM;
        this.day=day;
        this.kip=kip;
        this.giangvien=giangvien;
        this.phonghoc=phonghoc;
    }
    public String getIDM(){
        return idM;
    }
    public int getDay(){
        return day;
    }
    public int getKip(){
        return kip;
    }
    public String getGV(){
        return giangvien;
    }
    public String toString(){
        return idN+" "+day+" "+kip+" "+giangvien+" "+phonghoc;
    }
}
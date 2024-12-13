public class Lop {
    static int idx=0;
    private String idN;
    private String idM;
    private String nameM;
    private int day;
    private int kip;
    private String giangvien;
    private String phong;
    public Lop(String idM,int day,int kip,String giangvien,String phong){
        idx++;
        this.idN="HP"+String.format("%03d",idx);
        this.idM=idM;
        this.day=day;
        this.kip=kip;
        this.giangvien=giangvien;
        this.phong=phong;
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
    public void setNAMEM(String nameM){
        this.nameM=nameM;
    }
    public String toString(){
        return idN+" "+nameM+" "+day+" "+kip+" "+phong;
    }
}

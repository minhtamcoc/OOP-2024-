public class LichThi {
    private String idCT;
    private String idM;
    private String idN;
    private int sosinhvien;
    private String ngaythi;
    private String time;
    private String idP;
    private String nameM;
    public LichThi(String idCT,String idM,String idN,int sosinhvien){
        this.idCT=idCT;
        this.idM=idM;
        this.idN=idN;
        this.sosinhvien=sosinhvien;
    }
    public void setNgayThi(String ngaythi){
        this.ngaythi=ngaythi;
    }
    public void setTIME(String time){
        this.time=time;
    }
    public void setIDP(String idP){
        this.idP=idP;
    }
    public void setNameM(String nameM){
        this.nameM=nameM;
    }
    public String getIDCT(){
        return idCT;
    }
    public String getIDM(){
        return idM;
    }
    public String getidN(){
        return idN;
    }
    public int sosinhvien(){
        return sosinhvien;
    }
    public String toString(){
        return ngaythi+" "+time+" "+idP+" "+nameM+" "+idN+" "+sosinhvien;
    }
    public int getDAY(){
        return Integer.parseInt(ngaythi.substring(0,2));
    }
    public int getMONTH(){
        return Integer.parseInt(ngaythi.substring(3,5));
    }
    public int getYEAR(){
        return Integer.parseInt(ngaythi.substring(6));
    }
    public int getH(){
        return Integer.parseInt(time.substring(0,2));
    }
    public int getP(){
        return Integer.parseInt(time.substring(3));
    }
}

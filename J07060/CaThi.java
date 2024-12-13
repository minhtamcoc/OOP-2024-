public class CaThi {
    static int idx=0;
    private String idCT;
    private String ngaythi;
    private String time;
    private String idP;
    public CaThi(String ngaythi,String time,String idP){
        idx++;
        this.idCT="C"+String.format("%03d",idx);
        this.ngaythi=ngaythi;
        this.time=time;
        this.idP=idP;
    }
    public String getIDCT(){
        return idCT;
    }
    public String getNGAYTHI(){
        return ngaythi;
    }
    public String getTIME(){
        return time;
    }
    public String getIDP(){
        return idP;
    }
}

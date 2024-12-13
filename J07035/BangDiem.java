import java.text.DecimalFormat;

public class BangDiem {
    private String idSV;
    private String nameSV;
    private String lop;
    private String idM;
    private String tenmon;
    private double diem;
    public BangDiem(String idSV,String idM,double diem){
        this.idSV=idSV;
        this.idM=idM;
        this.diem=diem;
    }
    public String getIdSV(){
        return idSV;
    }
    public String getIdM(){
        return idM;
    }
    public void setName(String nameSV){
        this.nameSV=nameSV;
    }
    public void setTM(String tenmon){
        this.tenmon=tenmon;
    }
    public void setLop(String lop){
        this.lop=lop;
    }
    public double getDiem(){
        return diem;
    }
    public String getTM(){
        return tenmon;
    }
    public String toString(){
        DecimalFormat f=new DecimalFormat("#.#");
        return idSV+" "+nameSV+" "+lop+" "+f.format(diem);
    }
}

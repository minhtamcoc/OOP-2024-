import java.text.DecimalFormat;

public class BangDiem {
    private String idSV;
    private String idMH;
    private double GPA;
    private SinhVien a;
    private MonHoc b;
    public BangDiem(String idSV,String idMH,double GPA){
        this.idSV=idSV;
        this.idMH=idMH;
        this.GPA=GPA;
    }
    public void setSV(SinhVien a){
        this.a=a;
    }
    public void setMH(MonHoc b){
        this.b=b;
    }
    public String getLop(){
        return a.getLop();
    }
    public String getIDMH(){
        return idMH;
    }
    public String getIDSV(){
        return idSV;
    }
    public String toString(){
        DecimalFormat f=new DecimalFormat("#.#");
        return idSV+" "+a.getName()+" "+idMH+" "+b.getName()+" "+f.format(GPA);
    }
}
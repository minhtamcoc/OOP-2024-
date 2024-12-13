public class SanPham {
    private String idS;
    private String nameS;
    private long dongia1;
    private long dongia2;
    public SanPham(String idS,String nameS,long dongia1,long dongia2){
        this.idS=idS;
        this.nameS=nameS;
        this.dongia1=dongia1;
        this.dongia2=dongia2;
    }
    public String getIdS(){
        return idS;
    }
    public String getNames(){
        return nameS;
    }
    public long getDG1(){
        return dongia1;
    }
    public long getDG2(){
        return dongia2;
    }
}

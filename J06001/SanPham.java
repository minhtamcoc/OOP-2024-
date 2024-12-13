public class SanPham {
    private String idSP;
    private String nameSP;
    private long dongia1;
    private long dongia2;
    public SanPham(String idSP,String nameSP,long dongia1,long dongia2){
        this.idSP=idSP;
        this.nameSP=nameSP;
        this.dongia1=dongia1;
        this.dongia2=dongia2;
    }
    public String getIDSP(){
        return idSP;
    }
    public String getNameSP(){
        return nameSP;
    }
    public long getDG1(){
        return dongia1;
    }
    public long getDG2(){
        return dongia2;
    }
}


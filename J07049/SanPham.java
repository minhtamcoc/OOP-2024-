public class SanPham {
    private String idSP;
    private String nameSP;
    private int giaban;
    private int baohanh;
    public SanPham(String idSP,String nameSP,int giaban,int baohanh){
        this.idSP=idSP;
        this.nameSP=nameSP;
        this.giaban=giaban;
        this.baohanh=baohanh;
    }
    public String getIdSP(){
        return idSP;
    }
    public int getGB(){
        return giaban;
    }
    public int getBH(){
        return baohanh;
    }
}

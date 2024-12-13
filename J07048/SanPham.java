package J07048;

public class SanPham {
    private String id;
    private String name;
    private int giaban;
    private int baohanh;
    public SanPham(String id,String name,int giaban,int baohanh){
        this.id=id;
        this.name=name;
        this.giaban=giaban;
        this.baohanh=baohanh;
    }
    public String getID(){
        return id;
    }
    public int getGiaban(){
        return giaban;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+giaban+" "+baohanh;
    }
}
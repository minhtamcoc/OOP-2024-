public class Phong {
    private String id;
    private String name;
    private long dongia;
    private double phiphucvu;
    public Phong(String id,String name,long dongia,double phiphucvu){
        this.id=id;
        this.name=name;
        this.dongia=dongia;
        this.phiphucvu=phiphucvu;
    }
    public String getId(){
        return id;
    }
    public long getDonGia(){
        return dongia;
    }
    public double getPhiPhucVu(){
        return phiphucvu;
    }
}
public class SinhVien {
    private String id;
    private String name;
    private String lop;
    private int diem;
    public SinhVien(String id,String name,String lop){
        this.id=id;
        this.name=name;
        this.lop=lop;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getLop(){
        return lop;
    }
    public void setDiem(int diem){
        this.diem=diem;
    }
    public int getD(){
        return diem;
    }
    public String toString(){
        return id+" "+name+" "+lop+" "+diem;
    }
}

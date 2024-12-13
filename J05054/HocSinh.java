public class HocSinh {
    static int idx=0;
    private String name;
    private  String id;
    private double GPA;
    private String status;
    private  int xephang;
    public HocSinh(String name,double GPA){
        idx++;
        this.id="HS"+String.format("%02d",idx);
        this.name=name;
        this.GPA=GPA;
        if(GPA>=9){
            this.status="Gioi";
        }
        else if(GPA>=7){
            this.status="Kha";
        }
        else if(GPA>=5){
            this.status="Trung Binh";
        }
        else this.status="Yeu";
    }
    public void setXH(int xephang){
        this.xephang=xephang;
    }
    public int getXH(){
        return xephang;
    }
    public String getId(){
        return id;
    }
    public double getGPA(){
        return GPA;
    }
    public String toString(){
        return id+" "+name+" "+GPA+" "+status+" "+xephang;
    }
}

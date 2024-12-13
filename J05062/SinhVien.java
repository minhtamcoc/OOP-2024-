public class SinhVien {
    static int idx=0;
    private String id;
    private String name;
    private double GPA;
    private long DRL;
    private String status;
    public SinhVien(String name,double GPA,long DRL){
        idx++;
        this.id=String.format("%d",idx);
        this.name=name;
        this.GPA=GPA;
        this.DRL=DRL;
        this.status="KHONG";
    }
    public String getId(){
        return id;
    }
    public double getGPA(){
        return GPA;
    }
    public long getDRL(){
        return DRL;
    }
    public void setST(){
        if(GPA>=3.6&&DRL>=90){
            this.status="XUATSAC";
        }
        else if(GPA>=3.2&&DRL>=80){
            this.status="GIOI";
        }
         else if(GPA>=2.5&&DRL>=70){
            this.status="KHA";
        }
    }
    public void setKH(){
        this.status="KHONG";
    }
    public String toString(){
        return name+": "+status;
    }
}

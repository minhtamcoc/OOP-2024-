import java.text.DecimalFormat;

public class ThiSinh {
    private String id;
    private String name;
    private double toan;
    private double hoa;
    private double ly;
    private double diem;
    private double tong;
    private String status;
    private double diemcong;
    public ThiSinh(String id,String name,double toan,double ly,double hoa){
        this.id=id;
        this.name=name;
        this.toan=toan;
        this.ly=ly;
        this.hoa=hoa;
        double tmp=this.toan*2+this.hoa+this.ly;
        this.diem=tmp;
        String re=this.id.substring(2,3);
        if(re.equals("1")){
            this.diemcong=0.5;
        }
        else if(re.equals("2")){
            this.diemcong=1;
        }
        else this.diemcong=2.5;
        this.tong=tmp+this.diemcong;
        if(this.tong>=24){
            this.status="TRUNG TUYEN";
        }
        else this.status="TRUOT";
    }
    public String toString(){
        DecimalFormat f=new DecimalFormat("##.#");
        return id+" "+name+" "+f.format(diemcong)+" "+f.format(diem)+" "+status;
    }
}

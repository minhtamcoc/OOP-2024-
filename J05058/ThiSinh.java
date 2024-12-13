import java.text.DecimalFormat;

public class ThiSinh {
    private String id;
    private String name;
    private double toan;
    private double ly;
    private double hoa;
    private double diem;
    private double bonus;
    private double tong;
    private String status;
    public ThiSinh(String id,String name,double toan,double ly,double hoa){
        this.id=id;
        this.name=name;
        this.toan=toan;
        this.ly=ly;
        this.hoa=hoa;
        double res=this.toan*2+this.ly+this.hoa;
        this.diem=this.toan*2+this.ly+this.hoa;
        String tmp=id.substring(0,3);
        if(tmp.equals("KV1")) this.bonus=0.5;
        else if(tmp.equals("KV2")) this.bonus=1.0;
        else if(tmp.equals("KV3")) this.bonus=2.5;
        this.tong=this.diem+this.bonus;
        if(this.tong>=24) this.status="TRUNG TUYEN";
        else this.status="TRUOT";
    }
    public double getT(){
        return tong;
    }
    public String getId(){
        return id;
    }
    public String toString(){
        DecimalFormat f=new DecimalFormat("##.#");
        return id+" "+name+" "+f.format(bonus)+" "+f.format(tong)+" "+status;
    }
}

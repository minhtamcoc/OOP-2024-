import java.text.DecimalFormat;

public class DanhSach {
    private String id;
    private String name;
    private double toan;
    private double ly;
    private double hoa;
    private double diemuutien;
    private double tong;
    private String status;
    public DanhSach(String id,String name,double toan,double ly,double hoa){
        this.id=id;
        this.name=name;
        this.toan=toan;
        this.ly=ly;
        this.hoa=hoa;
        String re=id.substring(2,3);
        if(re.equals("1")) this.diemuutien=0.5;
        else if(re.equals("2")) this.diemuutien=1;
        else if(re.equals("3")) this.diemuutien=2.5;
        this.tong=(double)(this.toan*2+this.ly+this.hoa)+this.diemuutien;
    }
    public double getT(){
        return tong;
    }
    public String getId(){
        return id;
    }
    public void setSt(String status){
        this.status=status;
    }
    public String toString(){
        DecimalFormat f=new DecimalFormat("##.#");
        return id+" "+name+" "+f.format(diemuutien)+" "+f.format(tong)+" "+status;
    }
}

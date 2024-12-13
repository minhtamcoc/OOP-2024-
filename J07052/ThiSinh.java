import java.text.DecimalFormat;

public class ThiSinh {
    private String id;
    private String name;
    private double toan;
    private double ly;
    private double hoa;
    private double diem;
    private double diemcong;
    private double tong;
    private String status;
    private String chuanhoa(String s){
        String[] arr=s.split(" ");
        StringBuilder b=new StringBuilder();
        for(String x:arr){
            if(!x.isEmpty()){
                char tmp=Character.toUpperCase(x.charAt(0));
                b.append(tmp).append(x.substring(1)).append(" ");
            }
        }
        return b.toString().trim();
    }
    public ThiSinh(String id,String name,double toan,double ly,double hoa){
        this.id=id;
        name=chuanhoa(name);
        this.name=name;
        this.toan=toan;
        this.ly=ly;
        this.hoa=hoa;
        this.diem=2*this.toan+this.ly+this.hoa;
        double tmp=0;
        switch (id.charAt(2)) {
             case '1':
                tmp=0.5;
                break;
            case '2':
                tmp=1;
                break;
           case '3':
                tmp=2.5;
            default:
                break;
        }
        this.diemcong=tmp;
        this.tong=this.diem+this.diemcong;
    }
    public void setStatus(String status){
        this.status=status;
    }
    public double getTong(){
        return tong;
    }
    public String getId(){
        return id;
    }
    public String re(double a){
        DecimalFormat f=new DecimalFormat("#.#");
        String tmp=f.format(a);
        return tmp;
    }
    public String toString(){
        return id+" "+name+"  "+re(diemcong)+" "+re(tong)+" "+status;
    }
}

import java.text.DecimalFormat;
import java.text.ParseException;

public class GiaBan {
    private String id;
    private long dongia;
    private long soluong;
    private double thue;
    private double pvc;
    private double tong;
    public GiaBan(String id,long dongia,long soluong) throws ParseException{
        this.id=id;
        this.dongia=dongia;
        this.soluong=soluong;
        long tmp=this.soluong*this.dongia;
        String re=this.id.substring(0,1);
        String re1=this.id.substring(3);
        if(re.equals("T")){
            this.thue=(double)(0.29*tmp);
            this.pvc=(double)(0.04*tmp);
        }
        else if(re.equals("C")){
            this.thue=(double)(0.1*tmp);
            this.pvc=(double)(0.03*tmp);
        }
        else if(re.equals("D")){
            this.thue=(double)(0.08*tmp);
            this.pvc=(double)(0.025*tmp);
        }
        else if(re.equals("M")){
            this.thue=(double)(0.02*tmp);
            this.pvc=(double)(0.005*tmp);
        }
        if(re1.equals("C")){
            this.thue-=this.thue*0.05;
        }
        double x=(double)(tmp+this.thue+this.pvc);
        double res=(double)((x+x*0.2)/this.soluong);
        this.tong=(double)Math.round(res*100)/100;
    }   
    public String toString(){
        return id+" "+String.format("%.2f",tong);
    }
}

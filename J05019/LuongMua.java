import java.text.ParseException;
import java.text.SimpleDateFormat;

public class LuongMua {
    static int idx=0;
    private String id;
    private String tentram;
    private String start;
    private String end;
    private double thoigian;
    private long tongluongmua;
    private long TB;
    public LuongMua(String tentram,String start,String end,long luongmua) throws ParseException{
        idx++;
        this.id="T"+String.format("%02d",idx);
        this.tentram=tentram;
        this.start=start;
        this.end=end;
        SimpleDateFormat f=new SimpleDateFormat("hh:mm");
        long res=f.parse(this.end).getTime()-f.parse(this.start).getTime();
        double tmp=(double)res/3600000;
       this.thoigian=tmp;
       this.tongluongmua=luongmua;
    }
    public void setTime(double thoigian){
        this.thoigian+=thoigian;
    }
    public void setLM(long luongmua){
        this.tongluongmua+=luongmua;
    }
    public String getName(){
        return tentram;
    }
    public double getTB(){
        return (double)(this.tongluongmua/this.thoigian);
    }
    public String toString(){
        return id+" "+tentram+" ";
    }
}

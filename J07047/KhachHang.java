import java.text.*;
import java.util.*;
public class KhachHang {
    static int idx=0;
    private String id;
    private String name;
    private String maphong;
    private String start;
    private String end;
    private long ngayo;
    private double giamgia;
    private long dongia;
    private double phiphucvu;
    private double thanhtien;
    public KhachHang(String name,String maphong,String start,String end,long dongia,double phiphucvu) throws ParseException{
        idx++;
        this.id="KH"+String.format("%02d",idx);
        this.name=name;
        this.maphong=maphong;
        this.start=start;
        this.end=end;
        this.phiphucvu=phiphucvu;
        this.dongia=dongia;
        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
        long re1=f.parse(start).getTime();
        long re2=f.parse(end).getTime();
        long res=re2-re1;
        double tmp=(double)(res/86400000);
        if(tmp==0){
            this.ngayo=1L;
        }
        else{
            this.ngayo=(long)tmp;
        }
        long k=this.dongia*this.ngayo;
        if(this.ngayo>=30){
            this.giamgia=(double)(0.06*k);
        }
        else if(this.ngayo>=20){
            this.giamgia=(double)(0.04*k);
        }
        else if(this.ngayo>=10){
            this.giamgia=(double)(0.02*k);
        }
        else this.giamgia=0;
        this.thanhtien=k+this.phiphucvu*k-this.giamgia;
    }
    public long getNgayO(){
        return ngayo;
    }
    public String toString(){
        DecimalFormat f=new DecimalFormat("#.00");
        return id+" "+name+" "+maphong+" "+ngayo+" "+f.format(thanhtien);
    }
}
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class KhachHang {
    static int idx=0;
    private String id;
    private String name;
    private String numberP;
    private String startDay;
    private String endDay;
    private long Time;
    private long addFee;
    private long fee;
    private String chuanhoa(String s){
        String[] arr=s.split(" ");
        StringBuilder b=new StringBuilder();
        for(String x:arr){
            if (!x.isEmpty()) {
            char tmp=Character.toUpperCase(x.charAt(0));
            b.append(tmp).append(x.substring(1)).append(" ");
        }
    }
        return b.toString().trim();
    }
    public KhachHang(String name,String numberP,String startDay,String endDay,long addFee) throws ParseException{
        idx++;
        this.id="KH"+String.format("%02d",idx);
        name=chuanhoa(name);
        this.name=name;
        this.numberP=numberP;
        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
        this.startDay=f.format(f.parse(startDay));
        this.endDay=f.format(f.parse(endDay));
        Date s=f.parse(startDay);
        Date e=f.parse(endDay);
        long res=e.getTime()-s.getTime();
        long tmp=res/(1000*60*60*24);
        tmp++;
        this.Time=tmp;
        this.addFee=addFee;
        long k;
        switch (numberP.charAt(0)) {
            case '1':
                k=25;
                break;
            case '2':
            k=34;
            break;
            case '3':
            k=50;
            break;
            case '4':
            k=80;
            break;
            default:
            k=0;
                break;
        }
 this.fee=this.Time*k+this.addFee;
    }
    public long getFee(){
        return fee;
    }
    public String toString(){
        return id+" "+name+" "+numberP+" "+Time+" "+fee;
    }
}

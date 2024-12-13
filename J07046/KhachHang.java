import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class KhachHang  {
    static int idx=0;
    private String id;
    private String name;
    private String idP;
    private String ngayden;
    private String  ngaydi;
    private  long ngayo;
    public KhachHang(String name,String idP,String ngayden,String ngaydi) throws ParseException{
        idx++;
        this.id="KH"+String.format("%02d",idx);
        this.name=name;
        this.idP=idP;
        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
       Date s=f.parse(ngayden);
       Date t=f.parse(ngaydi);
       long res=t.getTime()-s.getTime();
       long tmp=res/(1000*60*60*24);
       this.ngayo=tmp;

    }
    public long getNgayo(){
        return ngayo;
    }
    public String toString(){
        return id+" "+name+" "+idP+" "+ngayo;
    }
}

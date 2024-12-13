import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class KhachHang {
    static int idx=0;
    private String id;
    private String name;
    private String gioitinh;
    private String age;
    private String add;
    private long tuoi;
    private String chuanhoa(String s){
        String[] ss=s.split("\\s+");
        StringBuilder re=new StringBuilder();
        for(String x:ss){
            if(!x.isEmpty()){
                char tmp=Character.toUpperCase(x.charAt(0));
                re.append(tmp).append(x.substring(1)).append(" ");
            }
        }
        return re.toString().trim();
    }
    public KhachHang(String name,String gioitinh,String age,String add) throws ParseException{
        idx++;
        this.id="KH"+String.format("%03d",idx);
        name=chuanhoa(name);
        this.name=name;
        this.gioitinh=gioitinh;
        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
        this.age=f.format(f.parse(age));
        this.add=add;
        Date tmp=f.parse(this.age);
        this.tuoi=tmp.getTime()/1000;
    }
    public long getT(){
        return tuoi;
    }
    public String toString(){
        return id+" "+name+" "+gioitinh+" "+add+" "+age;
    }
}

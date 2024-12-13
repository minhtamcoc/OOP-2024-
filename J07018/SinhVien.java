import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SinhVien {
    static int idx=0;
    private String id;
    private String name;
    private String birthday;
    private String lop;
    private double GPA;
    private String chuanhoa(String s){
        String[] arr=s.split("\\s+");
        StringBuilder b=new StringBuilder();
        for(String x:arr){
            if(!x.isEmpty()){
                char tmp=Character.toUpperCase(x.charAt(0));
                b.append(tmp).append(x.substring(1)).append(" ");
            }
        }
        return b.toString().trim();
    }
    public SinhVien(String name,String lop,String birthday,double GPA) throws ParseException{
        idx++;
        this.id="B20DCCN"+String.format("%03d",idx);
        name=chuanhoa(name);
        this.name=name;
        this.lop=lop;
        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
        this.birthday=f.format(f.parse(birthday));
        this.GPA =GPA;
    }
    public String toString(){
        return id+" "+name+" "+lop+" "+birthday+" "+String.format("%.2f",GPA);
    }
}

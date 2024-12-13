import java.text.ParseException;
import java.text.SimpleDateFormat;

public class KhachHang {
    static int idx=0;
    private String id;
    private String name;
    private String sex;
    private String age;
    private String add;
    private String Day;
    private String Month;
    private String Year;
    private String chuanhoa(String s){
        String[] arr=s.split("\\s+");
        StringBuilder ss=new StringBuilder();
        for(String x:arr){
            if(!x.isEmpty()){
                Character tmp=Character.toUpperCase(x.charAt(0));
                ss.append(tmp).append(x.substring(1)).append(" ");
            }
        }
        return ss.toString().trim();
    }
    public KhachHang(String name,String sex,String age,String add) throws ParseException{
        idx++;
        this.id="KH"+String.format("%03d",idx);
        name=chuanhoa(name);
        this.name=name;
        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
        String tmp=f.format(f.parse(age));
        this.age=tmp;
        String[] ss=tmp.split("/");
        this.Day=ss[0];
        this.Month=ss[1];
        this.Year=ss[2];
        this.sex=sex;
        this.add=add;
    }
    public int getDay(){
        return Integer.parseInt(Day);
    }
    public int getMonth(){
        return Integer.parseInt(Month);
    }
    public int getYear(){
        return Integer.parseInt(Year);
    }
    public String toString(){
        return id+" "+name+" "+sex+" "+add+" "+age;
    }
}
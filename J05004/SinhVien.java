import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SinhVien {
    static int idx=0;
    private String id;
    private String name;
    private String lop;
    private String age;
    private double GPA;
    private String chuahoa(String s){
        String[] arr=s.split("\\s+");
        StringBuilder ss=new StringBuilder();
        for(String x:arr){
            if(!x.isEmpty()){
                char tmp=Character.toUpperCase(x.charAt(0));
                ss.append(tmp).append(x.substring(1)).append(" ");
            }
        }
        return ss.toString().trim();
    }
    public SinhVien(String name,String lop,String age,double GPA) throws ParseException{
        idx++;
        this.id="B20DCCN"+String.format("%03d",idx);
        name=chuahoa(name);
        this.name=name;
        this.lop=lop;
        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
        this.age=f.format(f.parse(age));
        this.GPA=GPA;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+lop+" "+age+" "+String.format("%.2f",GPA);
    }
}

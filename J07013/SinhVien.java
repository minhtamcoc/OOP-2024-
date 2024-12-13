import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class SinhVien implements Serializable{
    static int idx=0;
    private String id;
    private String name;
    private Date age;
    private String lop;
    private float GPA;
    public SinhVien(String name,String lop,String age,float GPA) throws ParseException{
        idx++;
        this.id="B20DCCN"+String.format("%03d",idx);
        this.name=name;
        this.lop=lop;
        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
        this.age=f.parse(age);
        this.GPA=GPA;
    }
    public String toString(){
        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
        return id+" "+name+" "+lop+" "+f.format(age)+" "+String.format("%.2f",GPA);
    }
}
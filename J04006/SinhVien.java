import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SinhVien {
    private String id;
    private String name;
    private String lop;
    private String age;
    private double Gpa;
    public SinhVien(String name,String lop,String age,double Gpa) throws ParseException{
        this.id="B20DCCN001";
        this.name=name;
        this.lop=lop;
        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
        this.age=f.format(f.parse(age));
        this.Gpa=Gpa;
    }
    public String toString(){
        return id+" "+name+" "+lop+" "+age+" "+String.format("%.2f",Gpa);
    }
}
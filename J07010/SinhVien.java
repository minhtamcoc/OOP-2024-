
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

public class SinhVien {
    static int idx=0;
    private String id;
    private String name;
    private String year;
    private String lop;
    private double GPA;
    public SinhVien(String name, String lop, String year, double GPA) throws ParseException{
        idx++;
        this.id="B20DCCN"+String.format("%03d",idx);
        this.name=name;
        this.lop=lop;
        DateFormat f=new SimpleDateFormat("dd/MM/yyyy");
        this.year = f.format(f.parse(year));
        this.GPA=GPA;
    }
    @Override
    public String toString() {
        DecimalFormat df=new DecimalFormat("0.00");
        return id+" "+name+" "+lop+" "+year+" "+df.format(GPA);
    }
}

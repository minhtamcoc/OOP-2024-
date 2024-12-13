import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThoiGian {
    private String name;
    private String start;
    private String end;
    private long time;
    public ThoiGian(String name,String start,String end) throws ParseException{
        this.name=name;
        this.start=start;
        this.end=end;
        SimpleDateFormat date=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date x= date.parse(start);
        Date y=date.parse(end);
        long mm=y.getTime()-x.getTime();
        this.time=mm/60000;
    }
    public String getName(){
        return name;
    }
    public long getT(){
        return time;
    }
    public String toString(){
        return name+" "+time;
    }
}

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class GOI extends CUOC{
    private String thuebao;
    private String start;
    private String end;
    private long sophutgoi;
    private long tien;
    public GOI(String id,String name,long giacuoc,String thuebao,String start,String end) throws ParseException{
        super(id,name,giacuoc);
        this.thuebao=thuebao;
        this.start=start;
        this.end=end;
        SimpleDateFormat f=new SimpleDateFormat("HH:mm");
        Date x=f.parse(this.start);
        Date y=f.parse(this.end);
        long tmp=y.getTime()-x.getTime();
        long res=(long)(tmp/60000);
        if(getName().equals("Noi mang")){
            this.sophutgoi=(long)Math.ceil((double)(res/3)+1);
        }
        else this.sophutgoi=res;
        this.tien=getGC()*this.sophutgoi;
    }
    public long getT(){
        return tien;
    }
    public String toString(){
        return thuebao+" "+getName()+" "+sophutgoi+" "+tien;
    }
}

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class KhachSan {
    static int idx=0;
    private String id;
    private String name;
    private String sophong;
    private String ngaynhan;
    private String ngaytra;
    private int dichvu;
    private int ngayo;
    private int thanhtien;
    public KhachSan(String name,String sophong,String ngaynhan,String ngaytra,int dichvu) throws ParseException{
        idx++;
        this.id="KH"+String.format("%02d",idx);
        this.name=name;
        this.sophong=sophong;
        this.ngaynhan=ngaynhan;
        this.ngaytra=ngaytra;
        this.dichvu=dichvu;
        String re=sophong.substring(0,1);
        int res=0;
        switch (re) {
            case "1":
                res=25;
                break;
            case "2":
                res=34;
                break;
            case "3":
                res=50;
                break;
            case "4":
                res=80;
                break;
            default:
                break;
        }
        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
        long tmp=f.parse(ngaytra).getTime()-f.parse(ngaynhan).getTime();
        double k=(double) (tmp/86400000);
        this.ngayo=(int) Math.ceil(k)+1;
        this.thanhtien=this.ngayo*res+this.dichvu;
    }
    public int getTT(){
        return thanhtien;
    }
    public String toString(){
        return id+" "+name+" "+sophong+" "+ngayo+" "+thanhtien;
    }
}

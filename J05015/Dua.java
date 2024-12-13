import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Dua {
    private String id;
    private String name;
    private String donvi;
    private String end;
    private double thanhtich;
    private long v;
    public Dua(String name,String donvi,String end) throws ParseException{
        this.name=name;
        this.donvi=donvi;
        this.end=end;
        StringBuilder re=new StringBuilder();
        String[] ss=donvi.split(" ");
        String[] ss1=name.split(" ");
        for(String x:ss){
            char tmp=Character.toUpperCase(x.charAt(0));
            re.append(tmp);
        }
        for(String x:ss1){
            char tmp=Character.toUpperCase(x.charAt(0));
            re.append(tmp);
        }
        this.id=re.toString();
      String[] k=end.split(":");
      int h=Integer.parseInt(k[0]);
      int p=Integer.parseInt(k[1]);
      this.thanhtich=(h-6)+(p/60.0);
      double tmp=120/this.thanhtich;
      this.v=Math.round(tmp);
    }
    public double getTT(){
        return thanhtich;
    }
    public String toString(){
        return id+" "+name+" "+donvi+" "+v+" Km/h";
    }
}

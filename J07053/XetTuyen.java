import java.util.*;
public class XetTuyen {
    static int idx=0;
    private String id;
    private String name;
    private String age;
    private double lt;
    private double th;
    private double xl;
    private double bonus;
    private String status;
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
    public XetTuyen(String name,String year,double lt,double th){
        idx++;
        this.id="PH"+String.format("%02d",idx);
        name=chuanhoa(name);
        this.name=name;
        String[] date=year.split("/");
        this.age=String.valueOf(2021-Integer.parseInt(date[2]));
        this.lt=lt;
        this.th=th;
        double tmp=0;
        if(lt>=8&&th>=8){
            tmp=1;
        }
        else if(lt>=7.5&&th>=7.5){
            tmp=0.5;
        }
        this.bonus=tmp;
       double res=(lt+th)/2+tmp;
        res=Math.round(res);
        if(res>10) res=10;
        this.xl=res;
        if(this.xl==9||this.xl==10){
            this.status="Xuat sac";
        }
        else if(this.xl==8){
            this.status="Gioi";
        }
        else if(this.xl==7){
            this.status="Kha";
        }
        else if(this.xl==6||this.xl==5){
            this.status="Trung binh";
        }
        else if(this.xl<5){
            this.status="Truot";
        }
    }
    @Override
    public String toString(){
        return id+" "+name+" "+age+" "+(int)xl+" "+status;
    }
}
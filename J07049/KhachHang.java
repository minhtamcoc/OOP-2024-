import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class KhachHang {
    static int idx=0;
    private String id;
    private String name;
    private String add;
    private String idSP;
    private int soluong;
    private String ngaymua;
    private String ngayhethan;
    private int baohanh;
    private int dongia;
    private int thanhtien;
    private int day;
    private int month;
    private int year;
    public KhachHang(String name,String add,String idSP,int soluong,String ngaymua,int dongia,int baohanh) throws ParseException{
        idx++;
        this.id="KH"+String.format("%02d",idx);
        this.name=name;
        this.add=add;
        this.idSP=idSP;
        this.soluong=soluong;
        this.ngaymua=ngaymua;
        this.dongia=dongia;
        this.baohanh=baohanh;
        this.thanhtien=this.dongia*this.soluong;
        String[] ss=ngaymua.split("/");
        int Day=Integer.parseInt(ss[0]);
        int Month=Integer.parseInt(ss[1]);
        int Year=Integer.parseInt(ss[2]);
        int re=Month+this.baohanh;
        Month=re%12;
        Year+=re/12;
        String tmp=String.format("%d",Day)+"/"+String.format("%d",Month)+"/"+String.format("%d",Year);
        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
        this.ngayhethan=f.format(f.parse(tmp));
        String[] ss2=this.ngayhethan.split("/");
        this.day=Integer.parseInt(ss2[0]);
        this.month=Integer.parseInt(ss2[1]);
        this.year=Integer.parseInt(ss2[2]);
    }
   public int getDay(){
        return day;
   }
   public int getMonth(){
    return month;
   }
   public int getYear(){
    return year;
   }
    public String getID(){
        return id;
    }
    public String toString(){
        return id+" "+name+" "+add+" "+idSP+" "+thanhtien+" "+ngayhethan;
    }
}

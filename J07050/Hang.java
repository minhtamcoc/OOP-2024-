import java.text.DecimalFormat;

public class Hang {
    private static  int idx=0;
    private  String id;
    private  String name;
    private String nhomhang;
    private double giamua;
    private double giaban;
    private double loinhuan;
    public Hang(String name,String nhomhang,double giamua,double giaban) {
        idx++;
        this.id = "MH"+String.format("%02d",idx);
        this.name = name;
        this.nhomhang = nhomhang;
        this.giamua = giamua;
        this.giaban = giaban;
        this.loinhuan = this.giaban-this.giamua;
    }
    public double getLoinhuan() {
        return loinhuan;
    }
    @Override
    public String toString() {
        DecimalFormat f=new DecimalFormat("0.00");
        return id+" "+name+" "+nhomhang+" "+f.format(loinhuan);
    }
}

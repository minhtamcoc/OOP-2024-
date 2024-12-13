import java.util.*;
public class Kho {
    static Map<String,Integer> mp= new HashMap<>();
    private String id;
    private String name;
    private int soluong;
    private int dongia;
    private int chietkhau;
    private int thanhtien;
    public Kho(String name,int soluong,int dongia){
        this.name=name;
        this.soluong=soluong;
        this.dongia=dongia;
        String[] ss=name.split(" ");
        StringBuilder tmp=new StringBuilder();
        tmp.append(Character.toUpperCase(ss[0].charAt(0))).append(Character.toUpperCase(ss[1].charAt(0)));
        if(mp.containsKey(tmp.toString())) mp.put(tmp.toString(),mp.get(tmp.toString())+1);
        else mp.put(tmp.toString(),1);
        this.id=tmp.toString()+String.format("%02d",mp.get(tmp.toString()));
        if(soluong>10) this.chietkhau=(int)(this.dongia*this.soluong*0.05);
        else if(soluong>=8) this.chietkhau=(int)(this.dongia*this.soluong*0.02);
        else if(soluong>=5) this.chietkhau=(int)(this.dongia*this.soluong*0.01);
        else this.chietkhau=(int)(this.dongia*this.soluong*0);
        this.thanhtien=this.soluong*this.dongia-this.chietkhau;
    }
    public int getCK(){
        return chietkhau;
    }
    public String toString(){
        return id+" "+name+" "+chietkhau+" "+thanhtien;
    }
}

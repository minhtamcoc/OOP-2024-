import java.util.HashMap;
import java.util.Map;
public class Kho {
    static Map<String,Integer> mp=new HashMap<>();
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
        if(mp.containsKey(tmp.toString())) {
            mp.put(tmp.toString(),mp.get(tmp.toString())+1);
            this.id=tmp.toString()+String.format("%02d",mp.get(tmp.toString()));
        }
        else{
             mp.put(tmp.toString(),1);
             this.id=tmp.toString()+String.format("%02d",mp.get(tmp.toString()));
        }
        if(this.soluong>10){
            this.chietkhau=(int)(this.dongia*this.soluong*0.05);
        }
        else if(this.soluong>=8){
            this.chietkhau=(int)(this.dongia*this.soluong*0.02);
        }
        else if(this.soluong>=5){
            this.chietkhau=(int)(this.dongia*this.soluong*0.01);
        }
        else  this.chietkhau=(int)(this.dongia*this.soluong*0);
        this.thanhtien=this.soluong*this.dongia-this.chietkhau;
    }
    public String toString(){
        return id+" "+name+" "+chietkhau+" "+thanhtien;
    }
}

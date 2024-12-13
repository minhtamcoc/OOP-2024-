public class Luong {
    static int idx=0;
    private String id;
    private String name;
    private long luongngay;
    private long songaycong;
    private String chucvu;
    private long luongthang;
    private long thuong;
    private long phucap;
    private long thuclinh;
    public Luong(String name,long luongngay,long songaycong,String chucvu){
        idx++;
        this.id="NV"+String.format("%02d",idx);
        this.name=name;
        this.luongngay=luongngay;
        this.songaycong=songaycong;
        this.chucvu=chucvu;
        this.luongthang=this.luongngay*this.songaycong;
        if(this.songaycong>=25){
           double tmp=luongthang*0.2;
           this.thuong=(long) tmp;
        }
        else if(this.songaycong>=22){
           double tmp=luongthang*0.1;
           this.thuong=(long) tmp;
        }
        if(chucvu.equals("GD")) this.phucap=250000;
        else if(chucvu.equals("PGD")) this.phucap=200000;
        else if(chucvu.equals("TP")) this.phucap=180000;
        else if(chucvu.equals("NV")) this.phucap=150000;
        this.thuclinh=this.luongthang+this.phucap+this.thuong;
    }
    public long getTL(){
        return thuclinh;
    }
    public String toString(){
        return id+" "+name+" "+luongthang+" "+thuong+" "+phucap+" "+thuclinh;
    }
}

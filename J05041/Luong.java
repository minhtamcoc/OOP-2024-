public class Luong {    
    static int idx=0;
    private String id;
    private String name;
    private long luongcoban;
    private long songaycong;
    private String chucvu;  
    private long luongthang;
    private long thuong;
    private long phucap;
    private long thunhap;
    public Luong(String name,long luongcoban,long songaycong,String chucvu){
        idx++;
        this.id="NV"+String.format("%02d",idx);
        this.name=name;
        this.luongcoban=luongcoban;
        this.songaycong=songaycong;
        this.luongthang=luongcoban*songaycong;
        if(songaycong>=25){
            this.thuong=(long)(this.luongthang*0.2);
        }
        else if(songaycong>=22){
            this.thuong=(long)(this.luongthang*0.1);
        }
        if(chucvu.equals("GD")) this.phucap=250000;
        else if(chucvu.equals("PGD")) this.phucap=200000;
        else if(chucvu.equals("TP")) this.phucap=180000;
        else if(chucvu.equals("NV")) this.phucap=150000;
        this.thunhap=this.luongthang+this.phucap+this.thuong;
    }
    public long getTN(){
        return thunhap;
    }
    public String toString(){
        return id+" "+name+" "+luongthang+" "+thuong+" "+phucap+" "+thunhap;
    }
}

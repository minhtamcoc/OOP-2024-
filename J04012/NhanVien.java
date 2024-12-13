public class NhanVien {
    static int idx=0;
    private String id;
    private String name;
    private long luongcoban;
    private long songaycong;
    private long luongthang;
    private String chucvu;
    private long phucap;
    private long thunhap;
    private long thuong;
    public NhanVien(String name,long luongcoban,long songaycong,String chucvu){
        idx++;
        this.id=String.format("NV%02d",idx);
        this.name=name;
        this.luongcoban=luongcoban;
        this.songaycong=songaycong;
        this.chucvu=chucvu;
        long tmp=this.luongcoban*this.songaycong;
        this.luongthang=tmp;
        if(this.songaycong>=25){
            this.thuong=(long)(tmp*0.2);
        }
        else if(this.songaycong>=22){
            this.thuong=(long)(tmp*0.1);
        }
        else this.thuong=0;
        if(this.chucvu.equals("GD")){
            this.phucap=250000;
        }
        else if(this.chucvu.equals("PGD")){
            this.phucap=200000;
        }
        else if(this.chucvu.equals("TP")){
            this.phucap=180000;
        }
        else this.phucap=150000;
        this.thunhap=tmp+this.phucap+this.thuong;
    }    
    public String toString(){
        return id+" "+name+" "+luongthang+" "+thuong+" "+phucap+" "+thunhap;
    }
}

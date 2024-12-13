public class NhanVien {
    static int idx=0;
    private String id;
    private String name;
    private String chucvu;
    private long luongcoban;
    private long songaycong;
    private long luongchinh;
    private long phucap;
    private long tamung;
    private long conlai;
    public NhanVien(String name,String chucvu,long luongcoban,long songaycong){
        idx++;
        this.id="NV"+String.format("%02d",idx);
        this.name=name;
        this.chucvu=chucvu;
        this.luongcoban=luongcoban;
        this.songaycong=songaycong;
        switch (chucvu) {
            case "GD":
                this.phucap=500;
                break;
            case "PGD":
                 this.phucap=400;
                 break;
            case "TP":
                this.phucap=300;
                break; 
            case "KT":
                this.phucap=250;
                break;
            default:
            this.phucap=100;
                break;
        }
        this.luongchinh=this.luongcoban*this.songaycong;
        double tmp=((this.phucap+this.luongchinh)*2)/3;
        if(tmp<25000){
            this.tamung=Math.round(tmp*0.001)*1000;
        }
        else this.tamung=25000;
        this.conlai=this.luongchinh+this.phucap-this.tamung;
    }
    public String toString(){
        return id+" "+name+" "+phucap+" "+luongchinh+" "+tamung+" "+conlai;
    }
}

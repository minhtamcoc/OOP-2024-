public class Hang {
    private String id;
    private long soluongnhap;
    private long soluongxuat;
    private long dongia;
    private long tien;
    private long thue;
    public Hang(String id,long soluongnhap){
        this.id=id;
        this.soluongnhap=soluongnhap;
        if(id.charAt(0)=='A') this.soluongxuat=Math.round(this.soluongnhap*0.6);
        else if(id.charAt(0)=='B') this.soluongxuat=Math.round(this.soluongnhap*0.7);
        if(id.charAt(id.length()-1)=='Y') this.dongia=110000;
        else if(id.charAt(id.length()-1)=='N') this.dongia=135000;
        this.tien=this.soluongxuat*this.dongia;
        char re1=id.charAt(0);
        char re2=id.charAt(id.length()-1);
        if(re1=='A'&&re2=='Y') this.thue=(long)(this.tien*0.08);
        else if(re1=='A'&&re2=='N')  this.thue=(long)(this.tien*0.11);
        else if(re1=='B'&&re2=='Y') this.thue=(long)(this.tien*0.17);
        else if(re1=='B'&&re2=='N') this.thue=(long)(this.tien*0.22);
    }
    public String toString(){
        return id+" "+soluongnhap+" "+soluongxuat+" "+dongia+" "+tien+" "+thue;
    }
}

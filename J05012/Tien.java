public class Tien {
    private String id;
    private String name;
    private long soluong;
    private long dongia;
    private long chietkhau;
    private long tong;
    public Tien(String id,String name,long soluong,long dongia,long chietkhau){
        this.id=id;
        this.name=name;
        this.soluong=soluong;
        this.dongia=dongia;
        this.chietkhau=chietkhau;
        this.tong=this.dongia*this.soluong-this.chietkhau;
    }
    public long getT(){
        return tong;
    }
    public String toString(){
        return id+" "+name+" "+soluong+" "+dongia+" "+chietkhau+" "+tong;
    }
}

public class Hang {
    private String name;
    private String id;
    private long dongia;
    private long soluong;
    private String stt;
    private long giamgia;
    private long tienhang;
    private long thanhtien;
    public Hang(String name,String id,long dongia,long soluong){
        this.name=name;
        this.id=id;
        this.dongia=dongia;
        this.soluong=soluong;
        this.stt=id.substring(1,4);
        char tmp=id.charAt(id.length()-1);
        this.tienhang=this.dongia*this.soluong;
        if(tmp=='1'){
            this.giamgia=(long)(this.tienhang*0.5);
        }
        else if(tmp=='2'){
            this.giamgia=(long)(this.tienhang*0.3);
        }
        this.thanhtien=this.tienhang-this.giamgia;
    }
    public String toString(){
        return name+" "+id+" "+stt+" "+giamgia+" "+thanhtien;
    }
}

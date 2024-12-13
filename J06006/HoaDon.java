public class HoaDon {
    static int idx=0;
    private String idHD;
    private String idKH;
    private String idMH;
    private String nameKH;
    private String nameMH;
    private String add;
    private int giamua;
    private int giaban;
    private int soluong;
    private int thanhtien;
    private int loinhuan;
    public HoaDon(String idKH,String idMH,int soluong){
        idx++;
        this.idHD="HD"+String.format("%03d",idx);
        this.idKH=idKH;
        this.idMH=idMH;
        this.soluong=soluong;
    }
    public void setNameKH(String nameKH){
        this.nameKH=nameKH;
    }
    public void setNameMH(String nameMH){
        this.nameMH=nameMH;
    }
    public void setADD(String add){
        this.add=add;
    }
    public void setGM(int giamua){
        this.giamua=giamua;
    }
    public void setGB(int giaban){
        this.giaban=giaban;
    }
    public void setT(){
        this.thanhtien=this.soluong*this.giaban;
    }
    public void setLN(){
        this.loinhuan=(this.giaban-this.giamua)*this.soluong;
    }
    public String getIDKH(){
        return idKH;
    }
    public String getIDMH(){
        return idMH;
    }
    public int getLN(){
        return loinhuan;
    }
    public String toString(){
        return idHD+" "+nameKH+" "+add+" "+nameMH+" "+soluong+" "+thanhtien+" "+loinhuan;
    }
}

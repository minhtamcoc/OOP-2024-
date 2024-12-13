public class HoaDon {
    static int idx=0;
    private String idHD;
    private String idKH;
    private String idMH;
    private int soluong;
    private String nameKH;
    private String addr;
    private String nameMH;
    private String donvi;
    private int giamua;
    private int giaban;
    private int thanhtien;
    public HoaDon(String idKH,String idMH,int soluong){
        idx++;
        this.idHD="HD"+String.format("%03d",idx);
        this.idKH=idKH;
        this.idMH=idMH;
        this.soluong=soluong;
    }
    public String getIDKH(){
        return idKH;
    }
    public String getIDMH(){
        return idMH;
    }
    public void setNameKH(String nameKH){
        this.nameKH=nameKH;
    }
    public void setAddr(String addr){
        this.addr=addr;
    }
    public void setNameMH(String nameMH){
        this.nameMH=nameMH;
    }
    public void setDV(String donvi){
        this.donvi=donvi;
    }
    public void setGiaMua(int giamua){
        this.giamua=giamua;
    }
    public void setGiaBan(int giaban){
        this.giaban=giaban;
    }
    public int getGM(){
        return giamua;
    }
    public int getGB(){
        return giaban;
    }
    public int getSL(){
        return soluong;
    }
    public void setT(){
        this.thanhtien=getGB()*getSL();
    }
    public String toString(){
        return idHD+" "+nameKH+" "+addr+" "+nameMH+" "+donvi+" "+giamua+" "+giaban+" "+soluong+" "+thanhtien;
    }
}   

public class HoaDon {
    static int idx=0;
    private String idHD;
    private String idKH;
    private String idMH;
    private String nameKH;
    private String nameMH;
    private String add;
    private String donvi;
    private int giaban;
    private int giamua;
    private int soluong;
    private int thanhtien;
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
    public void setDV(String donvi){
        this.donvi=donvi;
    }
    public String getIDKH(){
        return idKH;
    }
    public String getIDMH(){
        return idMH;
    }
    public void setGB(int giaban){
        this.giaban=giaban;
    }
    public void setGM(int giamua){
        this.giamua=giamua;
    }
    public void setT(){
        this.thanhtien=this.soluong*this.giaban;
    }
    public String toString(){
        return idHD+" "+nameKH+" "+add+" "+nameMH+" "+donvi+" "+giamua+" "+giaban+" "+soluong+" "+thanhtien;
    }
}

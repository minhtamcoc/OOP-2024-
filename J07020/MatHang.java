public class MatHang {
    static int idx=0;
    private String idMH;
    private String nameMH;
    private String donvi;
    private int giamua;
    private int giaban;
    public MatHang(String nameMH,String donvi,int giamua,int giaban){
        idx++;
        this.idMH="MH"+String.format("%03d",idx);
        this.nameMH=nameMH;
        this.donvi=donvi;
        this.giamua=giamua;
        this.giaban=giaban;
    }
    public String getIDMH(){
        return idMH;
    }
    public String getNameMH(){
        return nameMH;
    }
    public String getDV(){
        return donvi;
    }
    public int getGM(){
        return giamua;
    }
    public int getGB(){
        return giaban;
    }
}

public class MatHang {
    static int idx=0;
    private String id;
    private String name;
    private String donvi;
    private int giamua;
    private int giaban;
    public MatHang(String name,String donvi,int giamua,int giaban){
        idx++;
        this.id="MH"+String.format("%03d",idx);
        this.name=name;
        this.donvi=donvi;
        this.giamua=giamua;
        this.giaban=giaban;
    }
    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDV(){
        return donvi;
    }
    public int getGB(){
        return giaban;
    }
    public int getGM(){
        return giamua;
    }
}

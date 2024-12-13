public class Hang {
    static int idx=0;
    private String id;
    private String name;
    private String donvi;
    private int giamua;
    private int giaban;
    private int loinhuan;
    public Hang(String name,String donvi,int giamua,int giaban){
        idx++;
        this.id="MH"+String.format("%03d",idx);
        this.name=name;
        this.donvi=donvi;
        this.giamua=giamua;
        this.giaban=giaban;
        this.loinhuan=this.giaban-this.giamua;
    }
    public int getLoinhuan(){
        return loinhuan;
    }
    public String getId(){
        return id;
    }
    public String toString(){
        return id+" "+name+" "+donvi+" "+giamua+" "+giaban+" "+loinhuan;
    }
}

public class ThoiGian {
    private int gio;
    private int phut;
    private int giay;
    public ThoiGian(int gio,int phut,int giay){
        this.gio=gio;
        this.phut=phut;
        this.giay=giay;
    }
    public int getGio(){
        return gio;
    }
    public int getPhut(){
        return phut;
    }
    public int getGiay(){
        return giay;
    }
    public String toString(){
        return gio+" "+phut+" "+giay;
    }
}

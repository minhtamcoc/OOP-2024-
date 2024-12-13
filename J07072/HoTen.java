public class HoTen {
    private String name;
    private String ten;
    private String hodem;
    public HoTen(String name,String ten,String hodem){
        this.name=name;
        this.ten=ten;
        this.hodem=hodem;
    }
    public String getTen(){
        return ten;
    }
    public String getHodem(){
        return hodem;
    }
    public String toString(){
        return name;
    }
}

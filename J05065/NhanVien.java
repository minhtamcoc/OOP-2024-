public class NhanVien {
    private String id;
    private String name;
    private String chucvu;
    private String heso;
    private String sohieu;
    public NhanVien(String id,String name){
        this.id=id;
        this.name=name;
        this.chucvu=this.id.substring(0,2);
        this.heso=this.id.substring(2,4);
        this.sohieu=this.id.substring(4);
    }
    public String getHeso(){
        return heso;
    }
    public String getSH(){
        return sohieu;
    }
    public String getCV(){
        return chucvu;
    }
    public String toString(){
        return name+" "+chucvu+" "+sohieu+" "+heso;
    }
}

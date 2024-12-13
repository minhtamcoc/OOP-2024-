public class ThucTap {
    static int idx=0;
    private int stt;
    private String id;
    private String name;
    private String lop;
    private String mail;
    private String doanhnghiep;
    public ThucTap(String id,String name,String lop,String mail,String doanhnghiep){
        idx++;
        this.stt=idx;
        this.id=id;
        this.name=name;
        this.lop=lop;
        this.mail=mail;
        this.doanhnghiep=doanhnghiep;
    }
    public String getName(){
        return name;
    }
    public String getDN(){
        return doanhnghiep;
    }
    public String toString(){
        return stt+" "+id+" "+name+" "+lop+" "+mail+" "+doanhnghiep;
    }
}

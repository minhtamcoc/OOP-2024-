public class SinhVien {
    private String id;
    private String name;
    private String lop;
    private String mail;
    private String khoa;
    public SinhVien(String id,String name,String lop,String mail){
        this.id=id;
        this.name=name;
        this.lop=lop;
        this.mail=mail;
        this.khoa="20"+lop.substring(1,3);
    } 
    public String getKhoa(){
        return khoa;
    }
    public String toString(){
        return id+" "+name+" "+lop+" "+mail;
    }
}

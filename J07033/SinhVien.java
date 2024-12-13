public class SinhVien {
    private String id;
    private String name;
    private String lop;
    private String mail;
    public SinhVien(String id, String name, String lop, String mail) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.mail = mail;
    }
    public String getId() {
        return id;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+lop+" "+mail;
    }
}

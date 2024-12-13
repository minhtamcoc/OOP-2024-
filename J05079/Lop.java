public class Lop {
    private String id;
    private String name;
    private String nhomlop;
    private String tengiangvien;
    public Lop(String id,String name,String nhomlop,String tengiangvien){
        this.id=id;
        this.name=name;
        this.nhomlop=nhomlop;
        this.tengiangvien=tengiangvien;
    }
    public String getNhom(){
        return nhomlop;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return nhomlop+" "+tengiangvien;
    }
}

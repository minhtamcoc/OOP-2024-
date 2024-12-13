public class ThucTap {
    static int idx=0;
    private int stt;
    private String id;
    private String name;
    private String lop;
    private String mail;
    private String Dn;
    public ThucTap(String id,String name,String lop,String mail,String Dn){
        idx++;
        this.stt=idx;
        this.id=id;
        this.name=name;
        this.lop=lop;
        this.mail=mail;
        this.Dn=Dn;
    }
    public String getDN(){
        return Dn;
    }
    public String getId(){
        return id;
    }
    public String toString(){
        return stt+" "+id+" "+name+" "+lop+" "+mail+" "+Dn;
    }
}   

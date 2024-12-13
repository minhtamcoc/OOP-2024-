public class PhongBan {
    private String idP;
    private String name;
    public PhongBan(String idP,String name){
        this.idP=idP;
        this.name=name;
    }
    public String getIdP(){
        return idP;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return idP+" "+name;
    }
}

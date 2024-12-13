public class MonHoc {
    private String id;
    private String name;
    private String hinhthuc;
    public MonHoc(String id,String name,String hinhthuc){
        this.id=id;
        this.name=name;
        this.hinhthuc=hinhthuc;
    }
    public String getId(){
        return id;
    }
    public String toString(){
        return id+" "+name+" "+hinhthuc;
    }
}

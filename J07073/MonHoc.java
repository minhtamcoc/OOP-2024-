public class MonHoc {
    private String id;
    private String name;
    private int tinchi;
    private String lt;
    private String th;
    public MonHoc(String id,String name,int tinchi,String lt,String th){
        this.id=id;
        this.name=name;
        this.tinchi=tinchi;
        this.lt=lt;
        this.th=th;
    }
    public String getId(){
        return id;
    }
    public String getTh(){
        return th;
    }
    public String toString(){
        return id+" "+name+" "+tinchi+" "+lt+" "+th;
    }
}

public class CUOC {
    private String id;
    private String name;
    private long giacuoc;
    public CUOC(String id,String name,long giacuoc){
        this.id=id;
        this.name=name;
        this.giacuoc=giacuoc;
    }
    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public long getGC(){
        return giacuoc;
    }
}

public class CLB {
    private String id;
    private String name;
    private long giave;
    public CLB(String id,String name,long giave){
        this.id=id;
        this.name=name;
        this.giave=giave;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public long getGiave(){
        return giave;
    }
}

public class Game extends CLB {
    private String code;
    private long khangia;
    private long loinhuan;
    public Game(String id,String name,long giave,String code,long khangia,long loinhuan){
        super(id,name,giave);
        this.code=code;
        this.khangia=khangia;
        this.loinhuan=loinhuan;
    }
    public long getDT(){
        return loinhuan;
    }
    public String toString(){
        return code+" "+getName()+" "+loinhuan;
    }
}

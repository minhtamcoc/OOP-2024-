public class DN {
    private String idD;
    private String name;
    private long soluong;
    public DN(String idD,String name,long soluong){
        this.idD=idD;
        this.name=name;
        this.soluong=soluong;
    }
    public String getId(){
        return idD;
    }
    public String getName(){
        return name;
    }
    public long getsoluong(){
        return soluong;
    }
}

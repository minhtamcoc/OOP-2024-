public class DoanhNghiep {
    private String id;
    private String name;
    private int soluong;
    public DoanhNghiep(String id,String name,int soluong){
        this.id=id;
        this.name=name;
        this.soluong=soluong;
    }
    public int getSL(){
        return soluong;
    }
    public String getID(){
        return id;
    }
    public String toString(){
        return id+" "+name+" "+soluong;
    }
}
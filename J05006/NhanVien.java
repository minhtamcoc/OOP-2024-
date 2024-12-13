public class NhanVien {
    static int idx=0;
    private String id;
    private String name;
    private String sex;
    private String age;
    private String add;
    private String mst;
    private String hd;
    public NhanVien(String name,String sex,String age,String add,String mst,String hd){
        idx++;
        this.id=String.format("%05d",idx);
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.add=add;
        this.mst=mst;
        this.hd=hd;
    }
    public String toString(){
        return id+" "+name+" "+sex+" "+age+" "+add+" "+mst+" "+hd;
    }
}

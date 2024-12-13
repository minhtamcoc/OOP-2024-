public class NhanVien {
    private String id;
    private String name;
    private String sex;
    private String age;
    private String add;
    private String mst;
    private String date;
    public NhanVien(String name,String sex,String age,String add,String mst,String date){
        this.id="00001";
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.add=add;
        this.mst=mst;
        this.date=date;
    }
    public String toString(){
        return id+" "+name+" "+sex+" "+age+" "+add+" "+mst+" "+date;
    }
}


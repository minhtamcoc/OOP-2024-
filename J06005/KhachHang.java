public class KhachHang {
    static int idx=0;
    private String id;
    private String name;
    private String gender;
    private String age;
    private String add;
    public KhachHang(String name,String gender,String age,String add){
        idx++;
        this.id="KH"+String.format("%03d",idx);
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.add=add;
    }
    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getADD(){
        return add;
    }
}

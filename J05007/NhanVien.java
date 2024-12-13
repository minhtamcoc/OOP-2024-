public class NhanVien {
    static int idx=0;
    private String id;
    private String name;
    private String sex;
    private String age;
    private String Day;
    private String Month;
    private String Year;
    private String add;
    private String mst;
    private String hd;
    public NhanVien(String name,String sex,String age,String add,String mst,String hd){
        idx++;
        this.id=String.format("%05d",idx);
        this.name=name;
        this.sex=sex;
        this.age=age;
        String[] arr=age.split("/");
        this.Day=arr[0];
        this.Month=arr[1];
        this.Year=arr[2];
        this.add=add;
        this.mst=mst;
        this.hd=hd;
    }
    public int getDay(){
        return Integer.parseInt(Day);
    }
    public int getMonth(){
        return Integer.parseInt(Month);
    }
    public int getYear(){
        return Integer.parseInt(Year);
    }
    public String toString(){
        return id+" "+name+" "+sex+" "+age+" "+add+" "+mst+" "+hd;
    }
}


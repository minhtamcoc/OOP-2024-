public class Person {
    static int idx=0;
    private String id;
    private String name;
    private String age;
    private double lythuyet;
    private double thuchanh;
    private int tuoi;
    private double diemthuong;
    private long tong;
    private String status;
    public Person(String name,String age,double lythuyet,double thuchanh){
        idx++;
        this.id="PH"+String.format("%02d",idx);
        this.name=name;
        this.age=age;
        String s=age.substring(6);
        int res=2021-Integer.parseInt(s);
        this.tuoi=res;
        this.lythuyet=lythuyet;
        this.thuchanh=thuchanh;
        if(lythuyet>=8&&thuchanh>=8){
            this.diemthuong=1;
        }
        else if(lythuyet>=7.5&&thuchanh>=7.5){
            this.diemthuong=0.5;
        }
        else this.diemthuong=0;
        double tmp=((this.lythuyet+this.thuchanh)/2)+this.diemthuong;
        this.tong=Math.min(Math.round(tmp), 10);
        if(this.tong==9||this.tong==10){
            this.status="Xuat sac";
        }
        else if(this.tong==8){
            this.status="Gioi";
        }
        else if(this.tong==7){
            this.status="Kha";
        }
        else if(this.tong>=5&&this.tong<=6){
            this.status="Trung binh";
        }
        else this.status="Truot";
    }
    public long getT(){
        return tong;
    }
    public String getId(){
        return id;
    }
    public String toString(){
        return id+" "+name+" "+tuoi+" "+tong+" "+status;
    }
}

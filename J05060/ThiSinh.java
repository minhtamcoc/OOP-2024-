public class ThiSinh {
    static int idx=0;
    private String id;
    private String name;
    private String age;
    private int tuoi;
    private double lythuyet;
    private double thuchanh;
    private double diemthuong;
    private long diemtrungbinh;
    private String status;
    public ThiSinh(String name,String age,double lythuyet,double thuchanh){
        idx++;
        this.id="PH"+String.format("%02d",idx);
        this.name=name;
        this.lythuyet=lythuyet;
        this.thuchanh=thuchanh;
        int tmp=Integer.parseInt(age.substring(6));
        this.tuoi=2021-tmp;
        if(this.lythuyet>=8&&this.thuchanh>=8){
            this.diemthuong=1;
        }
        else if(this.lythuyet>=7.5&&this.thuchanh>=7.5){
            this.diemthuong=0.5;
        }
        else this.diemthuong=0;
        double res=((this.lythuyet+this.thuchanh)/2)+this.diemthuong;
        this.diemtrungbinh=Math.min(Math.round(res),10);
        if(this.diemtrungbinh==9||this.diemtrungbinh==10) this.status="Xuat sac";
        else if(this.diemtrungbinh==8) this.status="Gioi";
        else if(this.diemtrungbinh==7) this.status="Kha";
        else if(this.diemtrungbinh>=5&&this.diemtrungbinh<=6) this.status="Trung binh";
        else this.status="Truot";
    }
    public String toString(){
        return id+" "+name+" "+tuoi+" "+diemtrungbinh+" "+status;
    }
}

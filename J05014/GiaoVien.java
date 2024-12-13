public class GiaoVien {
    static int idx=0;
    private String id;
    private String name;
    private String maxettuyen;
    private double tinhoc;
    private double chuyenmon;
    private String monhoc;
    private String status;
    private double tong;
    public GiaoVien(String name,String maxettuyen,double tinhoc,double chuyenmon){
        idx++;
        this.id="GV"+String.format("%02d",idx);
        this.name=name;
        this.maxettuyen=maxettuyen;
        this.tinhoc=tinhoc;
        this.chuyenmon=chuyenmon;
        String re=this.maxettuyen.substring(1);
        String re1=this.maxettuyen.substring(0,1);
        if(re1.equals("A")){
            this.monhoc="TOAN";
        }
        else if(re1.equals("B")){
            this.monhoc="LY";
        }
        else if(re1.equals("C")){
            this.monhoc="HOA";
        }
        double tmp=0;
        switch (re) {
            case "1":
                tmp=2.0;
                break;
            case "2":
                tmp=1.5;
                break;
            case "3":
                tmp=1.0;
                break;
            case "4":
                tmp=0;
                break;
        }
        this.tong=this.tinhoc*2+this.chuyenmon+tmp;
        if(this.tong>=18){
            this.status="TRUNG TUYEN";
        }
        else this.status="LOAI";
    }
    public String getId(){
        return id;
    }
    public double getT(){
        return tong;
    }
    public String toString(){
        return id+" "+name+" "+monhoc+" "+String.format("%.1f",tong)+" "+status;
    }
}

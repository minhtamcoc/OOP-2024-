public class Tien {
    static int idx=0;
    private String id;
    private String SD;
    private long chisocu;
    private long chisomoi;
    private long heso;
    private long thanhtien;
    private long phutroi;
    private long tongtien;
    public Tien(String SD,long chisocu,long chisomoi){
        idx++;
        this.id="KH"+String.format("%02d",idx);
        this.SD=SD;
        this.chisocu=chisocu;
        this.chisomoi=chisomoi;
        switch (SD) {
            case "KD":
                this.heso=3;
                break;
            case "NN":
                this.heso=5;
                break;
            case "TT":
                this.heso=4;
                break;
            case "CN":
                this.heso=2;
                break;
        }
        this.thanhtien=(this.chisomoi-this.chisocu)*this.heso*550;
        long tmp=this.chisomoi-this.chisocu;
        if(tmp>100){
            this.phutroi=this.thanhtien;
        }
        else if(tmp>=50){
            double res=this.thanhtien*0.35;
            this.phutroi=(long)Math.ceil(res);
        }
        else this.phutroi=0;
        this.tongtien=(this.phutroi+this.thanhtien);
    }
    public long getTong(){
        return tongtien;
    }
    public String toString(){
        return id+" "+heso+" "+thanhtien+" "+phutroi+" "+tongtien;
    }
}


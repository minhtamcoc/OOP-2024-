public class GiangVien {
    private String idGV;
    private String nameGV;
    private double time;
    public GiangVien(String idGV,String nameGV){
        this.idGV=idGV;
        this.nameGV=nameGV;
        this.time=0;
    }
    public void setTime(double time){
        this.time+=time;
    }
    public String getIDGV(){
        return idGV;
    }
    public String toString(){
        return nameGV+" "+String.format("%.2f",time);
    }
}

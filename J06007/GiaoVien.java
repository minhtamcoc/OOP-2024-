public class GiaoVien {
    private String idGV;
    private String nameGV;
    private double time;
    public GiaoVien(String idGV,String nameGV){
        this.idGV=idGV;
        this.nameGV=nameGV;
    }
    public String getIDGV(){
        return idGV;
    }
    public String getNameGV(){
        return nameGV;
    }
    public void setTime(double time){
        this.time+=time;
    }
    public String toString(){
        return nameGV+" "+String.format("%.2f",time);
    }
}

public class MonHoc {
    private String idM;
    private String nameM;
    private String idGV;
    public String nameGV;
    private double time;
    public MonHoc(String idM,String nameM){
        this.idM=idM;
        this.nameM=nameM;
    }
    public String getIDM(){
        return idM;
    }
    public String getNameM(){
        return nameM;
    }
    public void setGV(String nameGV){
        this.nameGV=nameGV;
    }
    public void setTIME(double time){
        this.time=time;
    }
    public void setIDGV(String idGV){
        this.idGV=idGV;
    }
    public String getIDGV(){
        return idGV;
    }
    public double getTime(){
        return time;
    }
    public String toString(){
        return nameM+" "+time;
    }
}

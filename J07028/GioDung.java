public class GioDung {
    private String idGV;
    private String idM;
    private double time;
    public GioDung(String idGV,String idM,double time){
        this.idGV=idGV;
        this.idM=idM;
        this.time=time;
    }
    public String getIDGV(){
        return idGV;
    }
    public double getTime(){
        return time;
    }
}

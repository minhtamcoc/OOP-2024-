public class GIO {
    private String idGV;
    private String idM;
    private double gio;
    public GIO(String idGV,String idM,double gio){
        this.idGV=idGV;
        this.idM=idM;
        this.gio=gio;
    }
    public String getIDGV(){
        return idGV;
    }
    public String geyIDM(){
        return idM;
    }
    public double getGio(){
        return gio;
    }
}

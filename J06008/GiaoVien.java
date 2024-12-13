public class GiaoVien {
    private String idGV;
    private String nameGV;
    public GiaoVien(String idGV,String nameGV){
        this.idGV=idGV;
        this.nameGV=nameGV;
    }
   public String getID(){
    return idGV;
   }
   public String getName(){
    return nameGV;
   }
}
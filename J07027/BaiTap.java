public class BaiTap {
    static int idx=0;
    private String idBT;
    private String nameBT;
    public BaiTap(String nameBT){
        idx++;
        this.idBT=String.format("%d",idx);
        this.nameBT=nameBT;
    }
    public String getIDBT(){
        return idBT;
    }
    public String getNameBt(){
        return nameBT;
    }
}

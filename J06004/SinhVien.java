public class SinhVien{
    private String id;
    private String name;
    private String phone;
    private String sttN;
    private String nameBT;
    public SinhVien(String id,String name,String phone,String sttN){
        this.id=id;
        this.name=name;
        this.phone=phone;
        this.sttN=sttN;
    }
    public String getID(){
        return id;
    }
    public String getSTTN(){
        return sttN;
    }
    public void setNameBT(String nameBT){
        this.nameBT=nameBT;
    }
    public String toString(){
        return id+" "+name+" "+phone+" "+sttN+" "+nameBT;
    }
}

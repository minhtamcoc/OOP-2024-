public class SinhVien {
    private String id;
    private String name;
    private String number;
    private String sttBT;
    private String nameBT;
    public SinhVien(String id,String name,String number){
        this.id=id;
        this.name=name;
        this.number=number;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getNum(){
        return number;
    }
   public void setSTTBT(String sttBT){
    this.sttBT=sttBT;
   }
   public String getSTTBT(){
    return sttBT;
   }
   public void setNameBT(String nameBT){
    this.nameBT=nameBT;
   }
   public String getNameBt(){
    return nameBT;
   }
    public String toString(){
        return id+" "+name+" "+number+" "+sttBT+" "+nameBT;
    }
}

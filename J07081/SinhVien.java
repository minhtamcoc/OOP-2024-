public class SinhVien {
    private String id;
    private String name;
    private String phone;
    private String mail;
    private String ten;
    private String hodem;
    public SinhVien(String id,String name,String phone,String mail){
        this.id=id;
        this.name=name;
        this.phone=phone;
        this.mail=mail;
        String[] arr=name.split(" ");
        this.ten=arr[arr.length-1];
        String tmp="";
        for(int i=0;i<arr.length-1;i++){
           tmp+=arr[i];
        }
        this.hodem=tmp;
    }
    public String getID(){
        return id;
    }
   public String getTen(){
    return ten;
   }
   public String getHodem(){
    return hodem;
   }
   public String getName(){
    return name;
   }
   public String toString(){
    return id+" "+name+" "+phone+" "+mail;
   }
}

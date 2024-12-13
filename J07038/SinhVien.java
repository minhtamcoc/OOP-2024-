public class SinhVien {
    private String id;
    private String name;
    private String lop;
    private String mail;
    private String Doanhnghiep;
    private String idDN;
    private String chuanhoa(String s){
        String[] ss=s.split("\\s+");
        StringBuilder tmp=new StringBuilder();
        for(String x:ss){
            if(!x.isEmpty()){
                char k=Character.toUpperCase(x.charAt(0));
                tmp.append(k).append(x.substring(1)).append(" ");
            }
        }
        return tmp.toString().trim();
    }
    public SinhVien(String id,String name,String lop,String mail){
        this.id=id;
        name=chuanhoa(name);
        this.name=name;
        this.lop=lop;
        this.mail=mail;
    }
    public String getId(){
        return id;
    }
    public void setDN(String Doanhnghiep){
        this.Doanhnghiep=Doanhnghiep;
    }
    public String getDN(){
        return Doanhnghiep;
    }
    public void setIdDN(String idDN){
        this.idDN=idDN;
    }
    public String getIDDN(){
        return idDN;
    }
    public String toString(){
        return id+" "+name+" "+lop;
    }
}

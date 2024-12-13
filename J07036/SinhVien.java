public class SinhVien {
    private String id;
    private String name;
    private String lop;
    private String mail;
    private String chuanhoa(String s){
        StringBuilder tmp=new StringBuilder();
        String[] ss=s.split("\\s+");
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
        this.name=chuanhoa(name);
        this.lop=lop;
        this.mail=mail;
    }
    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getLop(){
        return lop;
    }
}
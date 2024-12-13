public class SinhVien {
    private String id;
    private String name;
    private String lop;
    private String mail;
    private String chuanhoa(String s){
        StringBuilder res=new StringBuilder();
        String[] ss=s.split(" ");
        for(String x:ss){
            if(!x.isEmpty()){
                char tmp=Character.toUpperCase(x.charAt(0));
                res.append(tmp).append(x.substring(1)).append(" ");
            }
        }
        return res.toString().trim();
    }
    public SinhVien(String id,String name,String lop,String mail){
        this.id=id;
        name=chuanhoa(name);
        this.name=name;
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

public class SinhVien {
    private String id;
    private String name;
    private String lop;
    private String mail;
    private String nganh;
    public SinhVien(String id,String name,String lop,String mail){
        this.id=id;
        this.name=name;
        this.lop=lop;
        this.mail=mail;
        char c=this.id.charAt(0);
        String tmp=id.substring(3,7);
        if(tmp.equals("DCKT")){
            this.nganh="Ke toan";
        }
        else if(tmp.equals("DCVT")){
            this.nganh="Vien thong";
        }
        else if(tmp.equals("DCDT")){
            this.nganh="Dien tu";
        }
        else if(tmp.equals("DCAT")&&c!='E'){
           this.nganh="An toan thong tin";
        }
        else if(tmp.equals("DCCN")&&c!='E'){
         this.nganh="Cong nghe thong tin";
        }
        else this.nganh=" ";
    }
    public String getNganh(){
        return nganh;
    }
    public String toString(){
        return id+" "+name+" "+lop+" "+mail;
    }
}

public class GiaoVien {
    private String id;
    private String name;
    private int luongcoban;
    private int bacluong;
    private int phucap;
    private int thunhap;
    public GiaoVien(String id,String name,int luongcoban){
        this.id=id;
        this.name=name;
        this.luongcoban=luongcoban;
        this.bacluong=Integer.parseInt(id.substring(2));
        String tmp=id.substring(0,2);
        int res=0;
        if(tmp.equals("HT")){
            res=2000000;
        }
        else if(tmp.equals("HP")){
            res=900000;
        }
        else if(tmp.equals("GV")){
            res=500000;
        }
        this.phucap=res;
        this.thunhap=this.luongcoban*this.bacluong+this.phucap;
    }
    public String toString(){
        return id+" "+name+" "+bacluong+" "+phucap+" "+thunhap;
    }
}

public class NhanVien {
    private String id;
    private String name;
    private String phong;
    private String maphong;
    private long luongcoban;
    private long songaycong;
    private long bacluong;
    private long tong;
    public NhanVien(String id,String name,long luongcoban,long songaycong){
        this.id=id;
        this.name=name;
        this.luongcoban=luongcoban;
        this.songaycong=songaycong;
        String re1=id.substring(0,1);
        int re2=Integer.parseInt(id.substring(1, 3));
        if(re1.equals("A")){
            if(re2>=16){
                this.bacluong=20;
            }
            else if(re2>=9){
                this.bacluong=14;
            }
            else if(re2>=4){
                this.bacluong=12;
            }
            else if(re2>=1){
                this.bacluong=10;
            }
        }
        if(re1.equals("B")){
            if(re2>=16){
                this.bacluong=16;
            }
            else if(re2>=9){
                this.bacluong=13;
            }
            else if(re2>=4){
                this.bacluong=11;
            }
            else if(re2>=1){
                this.bacluong=10;
            }
        }
        if(re1.equals("C")){
            if(re2>=16){
                this.bacluong=14;
            }
            else if(re2>=9){
                this.bacluong=12;
            }
            else if(re2>=4){
                this.bacluong=10;
            }
            else if(re2>=1){
                this.bacluong=9;
            }
        }
        if(re1.equals("D")){
            if(re2>=16){
                this.bacluong=13;
            }
            else if(re2>=9){
                this.bacluong=11;
            }
            else if(re2>=4){
                this.bacluong=9;
            }
            else if(re2>=1){
                this.bacluong=8;
            }
        }
        this.maphong=id.substring(3);
        this.tong=this.luongcoban*this.songaycong*this.bacluong*1000;
    }
    public void setP(String phong){
        this.phong=phong;
    }
    public String getPhong(){
        return phong;
    }
    public String getMaP(){
        return maphong;
    }
    public String toString(){
        return id+" "+name+" "+tong;
    }
}

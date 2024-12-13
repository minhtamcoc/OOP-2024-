public class NhanVien {
    private String id;
    private String name;
    private String Phong;
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
        String re2=id.substring(1,3);
        int re=Integer.parseInt(re2);
        if(re1.equals("A")){
           if(re>=16){
            this.bacluong=20;
           }
           else if(re>=9){
            this.bacluong=14;
           }
           else if(re>=4){
            this.bacluong=12;
           }
           else if(re>=1){
            this.bacluong=10;
           }
        }
        if(re1.equals("B")){
            if(re>=16){
             this.bacluong=16;
            }
            else if(re>=9){
             this.bacluong=13;
            }
            else if(re>=4){
             this.bacluong=11;
            }
            else if(re>=1){
             this.bacluong=10;
            }
         }
         if(re1.equals("C")){
            if(re>=16){
             this.bacluong=14;
            }
            else if(re>=9){
             this.bacluong=12;
            }
            else if(re>=4){
             this.bacluong=10;
            }
            else if(re>=1){
             this.bacluong=9;
            }
         }
         if(re1.equals("D")){
            if(re>=16){
             this.bacluong=13;
            }
            else if(re>=9){
             this.bacluong=11;
            }
            else if(re>=4){
             this.bacluong=9;
            }
            else if(re>=1){
             this.bacluong=8;
            }
         }
         this.tong=this.luongcoban*this.songaycong*this.bacluong*1000;
    }
    public void setP(String Phong){
        this.Phong=Phong;
    }
    public String getID(){
        return id;
    }
    public String toString(){
        return id+" "+name+" "+Phong+" "+tong;
    }
}

public class GiaoVien {
    private String id;
    private String name;
    private long luongcoban;
    private int bacluong;
    private long phucap;
    private long thunhap;
    public GiaoVien(String id,String name,long luongcoban){
         this.id=id;
         this.name=name;
         this.luongcoban=luongcoban;
         String s=id.substring(0,2);
         if(s.equals("HT")){
            this.phucap=2000000;
         }
         else if(s.equals("HP")){
            this.phucap=900000;
         }
         else if(s.equals("GV")){
            this.phucap=500000;
         }
         String re=id.substring(2);
         this.bacluong=Integer.parseInt(re);
         this.thunhap=this.luongcoban*this.bacluong+this.phucap;
    }
    public String toString(){
        return id+" "+name+" "+bacluong+" "+phucap+" "+thunhap;
    }
}

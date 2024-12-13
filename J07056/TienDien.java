public class TienDien {
    static int idx=0;
    private String id;
    private String name;
    private String loai;
    private int i;
    private int o;
    private int vat;
    private int tong;
    private String chuanhoa(String s){
        String[] arr=s.split("\\s+");
        StringBuilder b=new StringBuilder();
        for(String x:arr){
            if(!x.isEmpty()){
                char tmp=Character.toUpperCase(x.charAt(0));
                b.append(tmp).append(x.substring(1)).append(" ");
            }
        }
        return b.toString().trim();
    }
    public TienDien(String name,String loai,int sd,int sc){
        idx++;
        this.id="KH"+String.format("%02d",idx);
        name=chuanhoa(name);
        this.name=name;
        this.loai=loai;
        int dm=0;
        if(loai.equals("A")){
            dm=100;
        }
        else if(loai.equals("B")){
            dm=500;
        }
        else if(loai.equals("C")){
            dm=200;
        }
        int sodien=sc-sd;
        if(sodien<dm){
            this.i=sodien*450;
            this.o=0;
        }
        else if(sodien>dm){
            this.i=dm*450;
            this.o=(sodien-dm)*1000;
        }
        this.vat= (int)(this.o *0.05);
        this.tong=this.i+this.o+this.vat;
    }
    public int getTong(){
        return tong;
    }
    public String toString(){
        return id+" "+name+" "+i+" "+o+" "+vat+" "+tong;
    }
}

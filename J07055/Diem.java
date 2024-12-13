public class Diem {
    static int idx=0;
    private String id;
    private String name;
    private double diem;
    private String status;
    private String chuanhoa(String s){
        String[] arr=s.split("\\s+");
        StringBuilder ss=new StringBuilder();
        for(String x:arr){
            if(!x.isEmpty()){
                char tmp=Character.toUpperCase(x.charAt(0));
                ss.append(tmp).append(x.substring(1)).append(" ");
            }
        }
        return ss.toString().trim();
    }
    public Diem(String name,int m1,int m2,int m3){
        idx++;
        this.id="SV"+String.format("%02d",idx);
        name=chuanhoa(name);
        this.name=name;
        double tmp=(double) (m1*0.25+m2*0.35+m3*0.4);
        this.diem=tmp;
        if(this.diem>=8){
            this.status="GIOI";
        }
        else if(this.diem>=6.5&&this.diem<=8){
            this.status="KHA";
        }
        else if(this.diem>=5&&this.diem<6.5){
            this.status="TRUNG BINH";
        }
        else{
            this.status="KEM";
        }
    }
    public double getDiem(){
        return diem;
    }
    public String toString(){
        return id+" "+name+" "+String.format("%.2f",diem)+" "+status;
    }
}

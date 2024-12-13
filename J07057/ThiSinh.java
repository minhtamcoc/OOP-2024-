public class ThiSinh {
    static int idx=0;
    private String id;
    private String name;
    private double Diem;
    private String Dantoc;
    private int khuvuc;
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
    public ThiSinh(String name,double Diemthi,String Dantoc,int khuvuc){
        idx++;
        this.id="TS"+String.format("%02d",idx);
        name=chuanhoa(name);
        this.name=name;
        double res=0;
        if(khuvuc==1){
            res=1.5;
        }
        else if(khuvuc==2){
            res=1;
        }
        if(!Dantoc.equals("Kinh")){
            res+=1.5;
        }
        this.Diem=Diemthi+res;
        if(this.Diem>=20.5){
            this.status="Do";
        }
        else this.status="Truot";
    }
    public double getDiem(){
        return Diem;
    }
    public String getId(){
        return id;
    }
    public String toString(){
        return id+" "+name+" "+String.format("%.1f", Diem)+" "+status;
    }
}

public class Diem {
    static int idx=0;
    private String id;
    private String name;
    private double tb;
    private int th;
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
        double tmp=(double)(m1*3+m2*3+m3*2)/8;
        this.tb=tmp;
    }
    public double getTb(){
        return tb;
    }
    public void setTH(int th){
        this.th=th;
    }
    public int getTH(){
        return th;
    }
    public String getId(){
        return id;
    }
    public String toString(){
        return id+" "+name+" "+String.format("%.2f",tb)+" "+th;
    }
}

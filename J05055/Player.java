public class Player {
    static int idx=0;
    private String id;
    private String name;
    private String age;
    private String start;
    private String end;
    private String thanhtichthucte;
    private String thanhtichxephang;
    private String uutien;
    private int xephang;
    public Player(String name,String age,String start,String end){
        idx++;
        this.id="VDV"+String.format("%02d",idx);
        this.name=name;
        this.age=age;
        this.start=start;
        this.end=end;
        String[] ss=age.split("/");
        int tuoi=Integer.parseInt(ss[2]);
        int tmp=2021-tuoi;
        int res=0;
        if(tmp>=32) res=3;
        else if(tmp>=25) res=2;
        else if(tmp>=18) res=1;
        else res=0;
        this.uutien="00:00:"+String.format("%02d",res);
        String[] ss1=start.split(":");
        String[] ss2=end.split(":");
        int x1=Integer.parseInt(ss1[0]);
        int y1=Integer.parseInt(ss1[1]);
        int z1=Integer.parseInt(ss1[2]);
        int x2=Integer.parseInt(ss2[0]);
        int y2=Integer.parseInt(ss2[1]);
        int z2=Integer.parseInt(ss2[2]);
        int re1=x1*3600+y1*60+z1;
        int re2=x2*3600+y2*60+z2;
        int tm1=re2-re1;// so giay thuc te;
        int h1=tm1/3600;
        int p1=(tm1%3600)/60;
        int s1=(tm1%3600)%60;
        this.thanhtichthucte=String.format("%02d",h1)+":"+String.format("%02d",p1)+":"+String.format("%02d",s1);
        int tm2=tm1-res;
        int h2=tm2/3600;
        int p2=(tm2%3600)/60;
        int s2=(tm2%3600)%60;
        this.thanhtichxephang=String.format("%02d",h2)+":"+String.format("%02d",p2)+":"+String.format("%02d",s2);
    }
    public void setXh(int xephang){
        this.xephang=xephang;
    }
    public int getXH(){
        return xephang;
    }
    public String getTT(){
        return thanhtichxephang;
    }
    public String getID(){
        return id;
    }
    public String toString(){
        return id+" "+name+" "+thanhtichthucte+" "+uutien+" "+thanhtichxephang+" "+xephang;
    }
}

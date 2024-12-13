public class Time {
    private String id;
    private String name;
    private String giovao;
    private String giora;
    private int giochoi;
    private int phutchoi;
    public Time(String id,String name,String giovao,String giora){
        this.id=id;
        this.name=name;
        this.giovao=giovao;
        this.giora=giora;
        String[] ss=giovao.split(":");
        int re1=Integer.parseInt(ss[0])*60+Integer.parseInt(ss[1]);
        String[] res=giora.split(":");
        int re2=Integer.parseInt(res[0])*60+Integer.parseInt(res[1]);
        int tmp=re2-re1;
        this.giochoi=tmp/60;
        this.phutchoi=tmp%60;
    }
    public int getGiochoi(){
        return giochoi;
    }
    public int getPhutchoi(){
        return phutchoi;
    }
    public String toString(){
        return id+" "+name+" "+giochoi+" gio "+phutchoi+" phut";
    }
}

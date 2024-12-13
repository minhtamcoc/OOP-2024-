public class GiangVien {
    static int idx=0;
    private String id;
    private String name;
    private String nganh;
    private String IDN;
    public GiangVien(String name,String nganh){
        idx++;
        this.id="GV"+String.format("%02d",idx);
        this.name=name;
        this.nganh=nganh;
        String[] ss=nganh.split(" ");
        StringBuilder tmp=new StringBuilder();
        for(String x:ss){
            char k=Character.toUpperCase(x.charAt(0));
            tmp.append(k);
        }
        this.IDN=tmp.toString();
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return id+" "+name+" "+IDN;
    }
}
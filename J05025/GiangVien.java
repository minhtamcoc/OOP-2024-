public class GiangVien {
    static int idx=0;
    private String id;
    private String name;
    private String nganh;
    private String IdN;
    private String ten;
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
        this.IdN=tmp.toString();
        String[] arr=name.split(" ");
        this.ten=arr[arr.length-1];
    }
    public String getId(){
        return id;
    }
    public String getTen(){
        return ten;
    }
    public String toString(){
        return id+" "+name+" "+IdN;
    }
}

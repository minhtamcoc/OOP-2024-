public class XepHang {
    private String name;
    private int AC;
    private int submit;
    public XepHang(String name,int AC,int submit){
        this.name=name;
        this.AC=AC;
        this.submit=submit;
    }
    public String getName(){
        return name;
    }
    public int getAC(){
        return AC;
    }
    public int getSub(){
        return submit;
    }
    public String toString(){
        return name+" "+AC+" "+submit;
    }
}

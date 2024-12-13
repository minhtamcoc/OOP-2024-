public class LoaiPhong implements Comparable<LoaiPhong>{
    private String KH;
    private String name;
    private String dongia;
    private String phi;
    public LoaiPhong(String solve) {
        String[] tmp=solve.split(" ");
        this.KH=tmp[0];
        this.name=tmp[1];
        this.dongia=tmp[2];
        this.phi=tmp[3];
    }
    public String getName(){
        return name;
    }
    public int compareTo(LoaiPhong o) {
        return getName().compareTo(o.getName());
    }
    public String toString(){
        return KH+" "+name+" "+dongia+" "+phi;
    }
}

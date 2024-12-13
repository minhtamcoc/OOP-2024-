package J07034;
public class Mon_Hoc{
private String code;
private String name;
private int ad;
public Mon_Hoc(String code,String name,int ad){
    this.code=code;
    this.name=name;
    this.ad=ad;
}
public String getName(){
    return name;
}
public String toString(){
    return code+" "+name+" "+ad;
}
}
public class Person {
    private String name;
    private String age;
    private int Day;
    private int Month;
    private int Year;
    public Person(String name,String age){
        this.name=name;
        this.age=age;
        String[] ss=age.split("/");
        this.Day=Integer.parseInt(ss[0]);
        this.Month=Integer.parseInt(ss[1]);
        this.Year=Integer.parseInt(ss[2]);
    }
    public int getDay(){
        return Day;
    }
    public int getMonth(){
        return Month;
    }
    public int getYear(){
        return Year;
    }
    public String toString(){
        return name;
    }
}

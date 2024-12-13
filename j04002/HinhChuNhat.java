public class HinhChuNhat {
    private double width;
    private double height;
    private String color;
    public HinhChuNhat(){
        this.width=1;
        this.height=1;
    }
    public HinhChuNhat(double width,double height,String color){
        this.width=width;
        this.height=height;
        this.color=color;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public double findArea(){
        return this.height*this.width;
    }
    public double findPerimeter(){
        return (this.height+this.width)*2;
    }
}

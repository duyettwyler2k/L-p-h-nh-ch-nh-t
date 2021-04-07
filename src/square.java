public class square {
    double width;
    double height;

    square(double width,double height){
        this.height=height;
        this.width=width;
    }
    double getWidth(){
        return this.width;
    }
    double getHeight(){
        return this.height;
    }
    void setWidth(){
        this.width=width;
    }
    void setHeight(){
        this.height=height;
    }
    double getArea(){
        double Area=this.height*this.width;
        return Area;
    }
    double getPerimeter(){
        double Perimeter=(this.width+this.height)*2;
        return Perimeter;
    }

    public static void main(String[] args) {
        square square=new square(10,5);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
    }
}

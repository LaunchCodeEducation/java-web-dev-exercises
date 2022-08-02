package studios.areaofacircle;

public class Circle {
    // constructor
    double radius;
    double circumfrence;


    public Circle(double radius){
        this.radius = radius;
        this.circumfrence = radius * 2;
    }

    public double getArea(){
        return 3.14 * this.radius * this.radius;
    }

}

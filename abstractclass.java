import java.util.Scanner;
abstract class shape{
    abstract double calcarea();
}
class circle extends shape{ 
    double radius;
    circle(double radius){   
        this.radius=radius;
    }
    double calcarea() { //override
        return Math.PI * radius * radius;
    }
}
class rect extends shape{
    double l;
    double w;
    rect(double l, double w){
        this.l=l;
        this.w=w;
    }
    double calcarea(){
        return (l*w);
    }
}
class triangle extends shape{
    double b;
    double h;
    triangle(double b, double h){
        this.b=b;
        this.h=h;
    }
    double calcarea(){
        return (0.5*b*h);
    }
}
public class abstractclass{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter radius of circle:");
        double radius=sc.nextDouble();
        circle c=new circle(radius);

        System.out.print("Enter the length of the rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double w = sc.nextDouble();
        rect r = new rect(l, w);

        // Input for Triangle
        System.out.print("Enter the base of the triangle: ");
        double b = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double h = sc.nextDouble();
        triangle t = new triangle(b, h);

        System.out.println("Area of Circle: " + c.calcarea());
        System.out.println("Area of Rectangle: " + r.calcarea());
        System.out.println("Area of Triangle: " + t.calcarea());

        // Close the scanner to prevent resource leak
        sc.close();

    }
}
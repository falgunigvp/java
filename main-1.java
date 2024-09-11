//Shape class- Base class
class Shape {
    //calculateArea method
    public double calculateArea() {
        //returns 0
        return 0;
    }
}
//Circle class extends Shape class
class Circle extends Shape {
    //declaring radius variable
    double radius;
    //Circle class constructor
    public Circle(double radius) {
        //assiging radius
        this.radius = radius;
    }
    //calculateArea Override method
    public double calculateArea() {
        //returning Circle area
        return Math.PI * radius * radius;
    }
}
//Rectangle class extends Shape class
class Rectangle extends Shape {
    //declaring length variable
    double length;
    //declaring width variable
    double width;
    
    //Rectangle constructor
    public Rectangle(double length, double width) {
        //assiging length
        this.length = length;
        //assiging width
        this.width = width;
    }
    //calculateArea Override method
    public double calculateArea() {
        //returning area of Rectangle
        return length * width;
    }
}
//Triangle class extends Shape class
class Triangle extends Shape {
    //declaring base variable
    double base;
    //declaring height variable
    double height;
    //Triangle constructor
    public Triangle(double base, double height) {
        //assiging base variable
        this.base = base;
        //assiging height variable
        this.height = height;
    }
    //calculateArea Override method
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
//main class
public class Main {
    //main method
    public static void main(String[] args) {
        //creating Circle class Object
        Circle circle = new Circle(2);
        //creating Rectangle class Object
        Rectangle rectangle = new Rectangle(2,4.0);
        //creating Triangle class Object
        Triangle triangle = new Triangle(2.2,5.0);
        
        //printing area of Circle
        System.out.println("Circle Area: " + circle.calculateArea());
        //printing area of Rectangle
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        //printing area of Triangle
        System.out.println("Triangle Area: " + triangle.calculateArea());
    }
}
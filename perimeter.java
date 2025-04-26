 interface Shape {
    double getPerimeter(); 
}

class Rectangle implements Shape {
    int width, height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double getPerimeter() { 
        return 2 * (width + height);
    }
}

class Circle implements Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle implements Shape {
    int side1;
    int side2;
    int side3;

    Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter() { 
        return side1 + side2 + side3;
    }
}

public class perimeter{
    public static void main(String[] args) { // Corrected brackets
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);
        Shape triangle = new Triangle(1, 2, 3);

        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
    }
}
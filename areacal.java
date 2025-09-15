public class areacal
{

    // Method to calculate area of a circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate area of a rectangle
    public double area(double length, double width) {
        return length * width;
    }

    // Method to calculate area of a square
    public double areaSquare(double side) {
        return side * side;
    }

    public static void main(String[] args) {
       areacal calc = new areacal();

        // Sample usage
        System.out.println("Area of Circle (radius 5): " + calc.area(5));
        System.out.println("Area of Rectangle (length 4, width 6): " + calc.area(4, 6));
        System.out.println("Area of Square (side 3): " + calc.areaSquare(3));
    }
}

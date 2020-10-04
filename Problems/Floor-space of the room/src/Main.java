import  java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String shape = s.nextLine();

        switch (shape) {
            case "triangle":
                System.out.println(triangle(s.nextDouble(), s.nextDouble(), s.nextDouble()));
                break;

            case "rectangle":
                System.out.println(rectangle(s.nextDouble(), s.nextDouble()));
                break;

            case "circle":
                System.out.println(circle(s.nextDouble()));
                break;

            default:
                System.out.println("Wrong Shape: " + shape);
                break;
        }
    }

    public static double triangle(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;

        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static double rectangle(double length, double width) {
        return length * width;
    }

    public static double circle(double radius) {
        return 3.14 * (radius * radius);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select a shape type:");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            System.out.println("4. Square");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the program.");
                break;
            }

            Shape shape = null;
            double area, perimeter;

            switch (choice) {
                case 1:
                    System.out.print("Enter width and height of the rectangle: ");
                    double width = scanner.nextDouble();
                    double height = scanner.nextDouble();
                    shape = new Rectangle(width, height);
                    break;

                case 2:
                    System.out.print("Enter radius of the circle: ");
                    double radius = scanner.nextDouble();
                    shape = new Circle(radius);
                    break;

                case 3:
                    System.out.print("Enter lengths of the triangle's sides: ");
                    double side1 = scanner.nextDouble();
                    double side2 = scanner.nextDouble();
                    double side3 = scanner.nextDouble();
                    shape = new Triangle(side1, side2, side3);
                    break;

                case 4:
                    System.out.print("Enter side length of the square: ");
                    double sideLength = scanner.nextDouble();
                    shape = new Square(sideLength);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            area = shape.getArea();
            perimeter = shape.getPerimeter();

            System.out.println("Shape: " + shape.getName());
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
        }

        scanner.close();
    }
}

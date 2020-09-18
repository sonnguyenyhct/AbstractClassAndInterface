import java.util.Arrays;

public class ComparableTest {
    public static void main(String[] args) {
        //Circle
        ComparableCircle[] circles = new ComparableCircle[4];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.2, "blue", false);
        circles[3] = new ComparableCircle(3.8);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        //Rectangle.
        ComparableRectangle[] rectangles = new ComparableRectangle[4];
        rectangles[0] = new ComparableRectangle(1, 2, "blue", false);
        rectangles[1] = new ComparableRectangle(3, 10, "blue", false);
        rectangles[2] = new ComparableRectangle(1, 9, "blue", false);
        rectangles[3] = new ComparableRectangle(5, 6, "blue", false);

        Arrays.sort(rectangles);
    
        // Sap xep theo chu vi.
        System.out.println();
        for (ComparableRectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

        //Square
        ComparableSquare[] squares = new ComparableSquare[4];
        squares[0] = new ComparableSquare(1, "blue", false);
        squares[1] = new ComparableSquare(2, "red", false);
        squares[2] = new ComparableSquare(4, "black", true);
        squares[3] = new ComparableSquare(3, "blue", false);

        Arrays.sort(squares);

        // sap sep theo size
        System.out.println();
        for (ComparableSquare square : squares) {
            System.out.println(square);
        }

        //test Resizeable.
        double percent = Math.random();

        Shape[] shapes = new Shape[4];
        shapes[0] = new Square(2, "blue", false);
        shapes[1] = new Square(3, "red", false);
        shapes[2] = new Rectangle(3, 5, "blue", false);
        shapes[3] = new Circle(3, "black", false);
        System.out.println("Before");
        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                System.out.format("%.2f%n",((Square) shape).getArea());
            } else if (shape instanceof Rectangle) {
                System.out.format("%.2f%n",((Rectangle) shape).getArea());
            } else if (shape instanceof Circle) {
                System.out.format("%.2f%n",((Circle) shape).getArea());
            }
        }
        System.out.println("After");
        for (Shape shape1 : shapes) {
            if (shape1 instanceof Square) {
                ((Square) shape1).resize(percent);
                System.out.format("%.2f%n",((Square) shape1).getArea());
                ((Colorable) shape1).howToColor();
            } else if (shape1 instanceof Rectangle) {
                ((Rectangle) shape1).resize(percent);
                System.out.format("%.2f%n",((Rectangle) shape1).getArea());
            } else if (shape1 instanceof Circle) {
                ((Circle) shape1).resize(percent);
                System.out.format("%.2f%n",((Circle) shape1).getArea());
            }

        }
    }
}
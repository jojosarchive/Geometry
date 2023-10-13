import java.util.Scanner;



/**
 * This program demonstrates static methods
 */

public class Geometry {
    /**
     * @param args = print
     */
    public static void main(String[] args) {
        int choice; // The user's choice
        double value; // The method's return value
        char letter; // The user's Y or N decision
        double radius; // The radius of the circle
        double length; // The length of the rectangle
        double width; // The width of the rectangle
        double height; // The height of the triangle
        double base; // The base of the triangle
        double side1; // The first side of the triangle
        double side2; // The second side of the triangle
        double side3; // The third side of the triangle


        Scanner keyboard = new Scanner(System.in);

        // The do loop allows the menu to be displayed first
        do {

            printMenu();

            choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of " + "the circle: ");
                    radius = keyboard.nextDouble();


                    // store the result in the value variable
                    value = circleArea(radius);
                    System.out.println("The area of the " + "circle is " + value);

                    break;
                case 2:
                    System.out.print("Enter the length of " + "the rectangle: ");
                    length = keyboard.nextDouble();
                    System.out.print("Enter the width of " + "the rectangle: ");
                    width = keyboard.nextDouble();


                    value = rectangleArea(length, width);
                    System.out.println("The area of the " + "rectangle is " + value);
                    break;
                case 3:
                    System.out.print("Enter the height of " + "the triangle: ");
                    height = keyboard.nextDouble();
                    System.out.print("Enter the base of " + "the triangle: ");
                    base = keyboard.nextDouble();

                    // store the result in the value variable
                    value = triangleArea(base, height);
                    System.out.println("The area of the " + "triangle is " + value);
                    break;
                case 4:
                    System.out.print("Enter the radius of " + "the circle: ");
                    radius = keyboard.nextDouble();

                    value = circleCircumfrence(radius);
                    System.out.println("The circumference " + "of the circle is " + value);
                    break;
                case 5:
                    System.out.print("Enter the length of " + "the rectangle: ");
                    length = keyboard.nextDouble();
                    System.out.print("Enter the width of " + "the rectangle: ");
                    width = keyboard.nextDouble();


                    value = rectanglePerimeter(length, width);
                    System.out.println("The perimeter of " + "the rectangle is " + value);
                    break;
                case 6:
                    System.out.print("Enter the length of " + "side 1 of the " + "triangle: ");
                    side1 = keyboard.nextDouble();
                    System.out.print("Enter the length of " + "side 2 of the " + "triangle: ");
                    side2 = keyboard.nextDouble();
                    System.out.print("Enter the length of " + "side 3 of the " + "triangle: ");
                    side3 = keyboard.nextDouble();

                    value = trianglePerimeter(side1, side2, side3);
                    System.out.println("The perimeter of " + "the triangle is " + value);
                    break;
                default:
                    System.out.println("You did not enter " + "a valid choice.");
            }
            keyboard.nextLine(); // Consume the new line

            System.out.println("Do you want to exit " + "the program (Y/N)?: ");
            String answer = keyboard.nextLine();
            letter = answer.charAt(0);

        } while (letter != 'Y' && letter != 'y');
    }


    static void printMenu() {
        System.out.println("This is a geometry calculator.");
        System.out.println("Choose what you like to calculate.");
        System.out.println("\n1.  Find the area of a circle");
        System.out.println("2.  Find the area of a rectangle");
        System.out.println("3.  Find the area of a triangle");
        System.out.println("4.  Find the circumfrence of a circle");
        System.out.println("5.  Find the perimeter of a rectangle");
        System.out.println("6.  Find the perimeter of a triangle");
        System.out.println("\nEnter the number of your choice:");
    }


    /**
     * The circleArea method takes a user inputed value of radius and places it in
     * the formula for the area of a circle, A = (pie)radius^2, and gives "double a" the
     * value of the product.
     * <p>
     * <p>
     * The circleArea method makes use of two methods from the math class, Math.PI
     * and Math.pow
     *
     * @param rad = radius of the circle
     * @return a = area of the circle
     */
    public static double circleArea(double rad) {

        return (Math.PI * Math.pow(rad, 2));
    }

    /**
     * The rectangleArea method takes a user inputed value of length and width and places it in
     * the formula for the area of a rectangle, A = length x width.
     *
     * @param len = length of rectangle
     * @param wid = width of rectangle
     * @return a = area of the rectangle
     */
    public static double rectangleArea(double len, double wid) {

        return len * wid;
    }

    /**
     * The triangleArea method takes a user inputed value of base and height and places it in
     * the formula for the area of a triangle, (base x height)/2
     *
     * @param bas = base of the triangle
     * @param hei = height of the triangle
     * @return a = area of the triangle
     */
    public static double triangleArea(double bas, double hei) {

        return (bas * hei) / 2;
    }

    /**
     * The circleCircumfrence method takes a user inputed value of radius and places it in
     * the formula for the circumfrence of the circle, ((pie) x radius)/2.
     *
     * @param rad = radius of circle
     * @return c = circumference of circle
     */
    public static double circleCircumfrence(double rad) {

        return 2 * (Math.PI * rad);
    }

    /**
     * The rectanglePerimeter method takes a user inputed value of length and width and places
     * it in the formula for the perimeter of a rectangle, 2Length + 2Width.
     *
     * @param len = length of rectangle
     * @param wid = width of rectangle
     * @return p = perimeter of rectangle
     */
    public static double rectanglePerimeter(double len, double wid) {

        return (2 * len) + (2 * wid);
    }

    /**
     * The trianglePerimeter method take a user inputed value of side 1, side 2 and side 3
     * and places it in the formula for the perimeter of a triangle, side 1 + side 2 + side 3
     *
     * @param s1 = side 1 of triangle
     * @param s2 = side 2 of triangle
     * @param s3 = side 3 of triangle
     * @return p = perimeter of triangle
     */

    public static double trianglePerimeter(double s1, double s2, double s3) {

        return s1 + s2 + s3;
    }
}

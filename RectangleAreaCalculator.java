import java.util.Scanner;
public class RectangleAreaCalculator{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of rectangle:");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of rectangle:");
        double width = scanner .nextDouble();
        double area = length * width;
        System.out.println("The area of rectangle is:" + area);
        scanner.close();
    }
}
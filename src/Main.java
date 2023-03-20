import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Method that returns a Class  :");
        System.out.println("_______________________________");
        System.out.println("Input the dimensions of the Square( equal length and Width ): ");

        System.out.print("length : ");
        int length = sc.nextInt();
        System.out.print("Width : ");
        int width =sc.nextInt();

        //method to print
        print(length, width);


    }

    private static void print(int length, int width) {
        PerimeterArea perimeterArea = new PerimeterArea(length,width);
        System.out.println("Perimeter and Area of the square:");
        System.out.println("Length:" + perimeterArea.getLength());
        System.out.println("Width:" + perimeterArea.getWidth());
        System.out.println("Perimeter:" + perimeterArea.getPerimeter());
        System.out.println("Area:" + perimeterArea.getArea());

    }
}
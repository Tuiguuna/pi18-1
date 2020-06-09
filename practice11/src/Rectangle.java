import java.util.Scanner;

public class Rectangle{
    public static void main(String[] args) {
        RectangleNew mail = new RectangleNew();
        mail.displayInfo();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите а: ");
        mail.a = in.nextInt();
        System.out.print("Введите b: ");
        mail.b = in.nextInt();
        mail.displayInfo();
    }
}
class RectangleNew{
    Integer a = 0;
    Integer b = 0;

    void displayInfo() {
        int p = 2*(a + b);
        double s = a*b;
        System.out.println("A: " + a + "  B: " + b);
        System.out.println("S: " + s);
        System.out.println("P: " + p);
    }
}
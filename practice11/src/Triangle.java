import java.util.Scanner;

public class Triangle{
    public static void main(String[] args) {
        TriangleNew mail = new TriangleNew();
        mail.displayInfo();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите а: ");
        mail.a = in.nextInt();
        System.out.print("Введите b: ");
        mail.b = in.nextInt();
        System.out.print("Введите с: ");
        mail.c = in.nextInt();
        mail.displayInfo();
    }
}
class TriangleNew{
    Integer a = 0;
    Integer b = 0;
    Integer c = 0;

    void displayInfo() {
        int p = a + b + c;
        double s = Math.sqrt(p / 2 * (p / 2 - a) * (p / 2 - b) * (p / 2 - c));
        System.out.println("A: " + a + "  B: " + b + "  C:  " + c);
        System.out.println("S: " + s);
        System.out.println("P: " + p);
    }
}
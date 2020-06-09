import java.util.Random;
import java.util.Scanner;

class Massiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.print("Введите число строк матрицы: ");
        int x = sc.nextInt();
        System.out.print("Введите число столбцов матрицы: ");
        int y = sc.nextInt();
        int mas[][] = new int[x][y];

        System.out.println("Элементы матрицы: ");
        for (i = 0; i < x; i++) {
            for (j = 0; j < y; j++) {
                Random r = new Random();
                mas[i][j] = (r.nextInt(150) - 50) + 1;
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
            System.out.println();
        }

        for (i = 0; i < x; i++) {
            int min = 100;
            int max = -50;
            for (j = 0; j < y; j++) {
                if (mas[i][j] < min) min = mas[i][j];
                if (mas[i][j] > max) max = mas[i][j];
            }
            for (j = 0; j < y; j++) {
                if (min == mas[i][j]) {
                    mas[i][j] = mas[i][0];
                    mas[i][0] = min;
                }
            }
            for (j = 0; j < y; j++) {
                if (mas[i][j] == max) {
                    mas[i][j] = mas[i][mas.length - 1];
                    mas[i][mas.length - 1] = max;
                }
            }
        }
        System.out.println("После сортировки: ");
        for (i = 0; i < x; i++) {
            for (j = 0; j < y; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
            System.out.println();
        }
    }
}
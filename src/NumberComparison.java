import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод чисел a и b
        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Операции с числами
        System.out.println("Результаты операций:");
        System.out.println("Сложение: a + b = " + (a + b));
        System.out.println("Вычитание: a - b = " + (a - b));
        System.out.println("Умножение: a * b = " + (a * b));

        // Проверка деления на 0
        if (b != 0) {
            System.out.println("Деление: a / b = " + ((double) a / b));
        } else {
            System.out.println("Деление невозможно: деление на ноль");
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите задачу:");
        System.out.println("1 - Работа с числами");
        System.out.println("2 - Сравнение строк");
        System.out.println("3 - Вывод четных чисел из массива");
        System.out.print("Введите номер задачи: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Считываем номер

        switch (choice) {
            case 1:
                handleNumberOperations(scanner);
                break;
            case 2:
                handleStringComparison(scanner);
                break;
            case 3:
                handleEvenNumbers();
                break;
            default:
                System.out.println("Выбери задачу из 1 - 2 - 3");
        }

        scanner.close();
    }

    // Сравнение числа и операции с числами
    private static void handleNumberOperations(Scanner scanner) {
        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();

        // Сравнение
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Операции с числами
        System.out.println("Результаты:");
        System.out.println("Сложение: a + b = " + (a + b));
        System.out.println("Вычитание: a - b = " + (a - b));
        System.out.println("Умножение: a * b = " + (a * b));

        if (b != 0) {
            System.out.println("Деление: a / b = " + ((double) a / b));
        } else {
            System.out.println("Деление невозможно: деление на ноль");
        }
    }

    // Сравнение строк
    private static void handleStringComparison(Scanner scanner) {
        System.out.print("Введите строку (a): ");
        String a = scanner.nextLine();
        System.out.print("Введите строку (b): ");
        String b = scanner.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }

    // Четные числа из массива
    private static void handleEvenNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Четные числа из массива:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Введите операция: ");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        Scanner scanner = new Scanner(System.in);
        int oper = scanner.nextInt();
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int result;

        if (oper == 1) {
            result = a + b;
        }
        else if (oper == 2) {
            result = a - b;
        }
        else if (oper == 3){
            result = a * b;
        }
        else{
            result = a / b;

        }
        System.out.println("Результат: " + result);

    }
}

import java.util.Random;
import java.util.Scanner;
/*Нужно считать с консоли число, создать целочисленный массив размером введенного числа,
 заполнить его (с помощью класса Random)
Пробежаться по циклу и найти освпадающее число с введенным (второе введенное число),
вывести в консоль(нашлось или нет) вывод результата совпадения реализовать с foreach.*/

public class Mass {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            System.out.print("Введите число для поиска совпадения: ");
            int target = scanner.nextInt();

            int[] array = new int[size];
            Random random = new Random();

            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(100);
            }

            boolean found = false;
            for (int num : array) {
                if (num == target) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Совпадающее число найдено.");
            } else {
                System.out.println("Совпадающее число не найдено.");
            }
        }

}

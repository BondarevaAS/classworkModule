import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case (1): {
                System.out.println("Понедельник");
                break;
            }
            case (2): {
                System.out.println("Вторник");
                break;
            }
            case (3) : {
                System.out.println("Среда");
                break;
            }
            case (4) : {
                System.out.println("Четверг");
                break;
            }
            case (5) : {
                System.out.println("Пятница");
                break;
            }
            case (6) : {
                System.out.println("Суббота");
                break;

            }
            default : {
                System.out.println("вы ввели не правильный день недели");

            }
        }

    }
}


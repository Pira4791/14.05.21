import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        System.out.println("Введите третье число");
        int c = sc.nextInt();
        System.out.println("Введите операцию: 1 - сумма, 2 - произведение");

        int d = sc.nextInt();

        switch (d){
            case 1:
                System.out.println(a + b + c);
                break;
            case 2:
                System.out.println(a * b * c);
        }

    }
}

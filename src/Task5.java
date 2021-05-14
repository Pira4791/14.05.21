import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter time");
        int time = sc.nextInt();
        if (time > 0 && time <= 6) {
            System.out.println("Good Night");
        }
        if (time > 6 && time <= 13) {
            System.out.println("Good Morning");
        }
        if (time > 13 && time <= 17) {
            System.out.println("Good Day");
        }
        if (time > 17 && time <= 24) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Not a time");


        }
    }
}

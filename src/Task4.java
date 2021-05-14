import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество метров");
        double a = sc.nextInt();
        System.out.println("1 - mils, 2 - inches, 3 - yards");
        int b = sc.nextInt();
        switch (b){
            case 1 :
                double mils = a / 1600;
                System.out.println(mils);
                break;
            case 2 :
                double inches = a * 39.37;
                System.out.println(inches);
                break;
            case 3 :
                double yards = a * 1.09;
                System.out.println(yards);
                break;
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Another number");
                break;
        }
        scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        switch (name) {
            case "John":
                System.out.println("Hello, John!");
                break;
            case "Alice":
                System.out.println("Welcome, Alice!");
                break;
            default:
                System.out.println("Hello, guest!");
                break;
        }
    }
}
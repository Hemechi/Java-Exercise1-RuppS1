import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("1. Input Number");
            System.out.println("2. Output Number");
            System.out.println("3. Exit");
            System.out.print("Choose the option: ");
            int opt = scanner.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("Enter the number of values you want to input: ");
                    int n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter number: ");
                        int number = scanner.nextInt();
                        numbers[count] = number;
                        count++;
                        if (number < 0) {
                            break;
                        }
                    }
                    System.out.println("Numbers inputted successfully!");
                    break;

                case 2:
                    System.out.println("Outputting Numbers:");
                    for (int i = 0; i < count; i++) {
                        System.out.println("Number: " + numbers[i]);
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid Option!");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }
}
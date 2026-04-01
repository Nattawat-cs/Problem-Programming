import java.util.Scanner;

public class SumNumN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.print("Enter number : ");
        int number = sc.nextInt();

        for(int i = 0; i <= number; i++){
            sum += i;
        }

        System.out.println("Summation is " + sum);
    }
}

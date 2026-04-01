import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isPrime = true;

        System.out.print("Enter number : ");
        int number = sc.nextInt();

        if(number <= 1){
            isPrime = false;
        }else{
            for(int i = 2; i < number; i++){
                if(number % i == 0){
                    isPrime = false;
                }
            }
        }

        if(isPrime){
            System.out.println("Prime");
        }else{
            System.out.println("Is not Prime");
        }

    }
}

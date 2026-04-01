import java.util.Scanner;

public class FindMaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size : ");
        int size = sc.nextInt();

        int number[] = new int[size];

        for(int i = 0; i < number.length; i++){
            System.out.print("Enter number " + (i+1) + " : ");
            number[i] = sc.nextInt();
        }               

        //Find Max
        int Max = number[0];        
        for(int j = 0; j < number.length; j++){
            if(Max < number[j]){
                Max = number[j];
            }
        }

        System.out.println("Max number is : " + Max);
    }
}

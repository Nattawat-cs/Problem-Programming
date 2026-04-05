import java.util.Scanner;

class CountnumN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int number = sc.nextInt();

        int digit = 0;
        int count = 0;

        if(number == 0){
            count = 1;
        }else{
             while(number > 0){
                count++;
                number = number / 10;
            }
        }

        System.out.println(count);
    }
}
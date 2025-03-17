package Practice;

import java.util.Scanner;

public class Challenge_37 {

    public static boolean isArmstrong(int n){
        int temp, digit = 0, last = 0, sum = 0;
        temp = n;
        while(temp > 0){
            temp = temp/10;
            digit++;
        }
        temp = n;
        while(temp > 0){
            last = temp % 10;
            sum += Math.pow(last,digit);
            temp = temp/10;
        }
        if(n==sum){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to check: ");
        int num = sc.nextInt();

        if (isArmstrong(num)){
            System.out.println("This is an armstrong number");
        }
        else System.out.println("This is not an armstrong number");
    }
}

package SemicolonsTask;

import java.util.Scanner;

public class FindSecondLargestNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int largestNumber = 0;

        for (int i = 0; i < 10; i++) {
            int numbers = input.nextInt();

            if (numbers > largestNumber) {
                largestNumber = numbers;
            }
        }
        System.out.printf("%d is the largest number", largestNumber);
    }
}

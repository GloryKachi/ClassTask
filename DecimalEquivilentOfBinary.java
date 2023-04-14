package SemicolonsTask;

public class DecimalEquivilentOfBinary {
    public static int convertToDecimal(int binary){
       int newValue = binary;
        String number = String.valueOf(binary);
        int sum = 0;
        int multiply = 1;

        for (int counter = 0; counter < number.length(); counter++){
            int lastDigit = newValue % 10;
            newValue = newValue / 10;
            sum += lastDigit * multiply;
            multiply *= 2;
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        convertToDecimal(1101);
    }

}


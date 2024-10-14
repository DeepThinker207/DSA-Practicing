import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input binary number from the user
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        // Convert binary to decimal
        int decimal = binaryToDecimal(binaryString);

        // Display the result
        System.out.println("Decimal equivalent: " + decimal);

        scanner.close();
    }

    public static int binaryToDecimal(String binaryString) {
        int decimal = 0;
        int power = 0;

        // Iterate over each character of the binary string starting from the rightmost
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            // Convert character to integer
            int digit = Character.getNumericValue(binaryString.charAt(i));

            // Update decimal using the formula: decimal += digit * 2^power
            decimal += digit * Math.pow(2, power);
            power++;
        }

        return decimal;
    }
}

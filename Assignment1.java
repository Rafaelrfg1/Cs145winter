//Name: Rafael Figueroa
//Date: 1/17/25
//Assignment: Phone Keypads





import java.util.Scanner;


//Write a method that returns the location of the largest element in a two-dimnesional array
public class Assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter some characters: ");
        String phoneNumber = input.nextLine();

        StringBuilder convertedNumber = new StringBuilder(); // To store the resulting characters

        for (int i = 0; i < phoneNumber.length(); i++) {
            char ch = phoneNumber.charAt(i); // Process each character
            int number = 0;

            switch (Character.toUpperCase(ch)) {
                case 'A': case 'B': case 'C':
                    number = 2; break;
                case 'D': case 'E': case 'F':
                    number = 3; break;
                case 'G': case 'H': case 'I':
                    number = 4; break;
                case 'J': case 'K': case 'L':
                    number = 5; break;
                case 'M': case 'N': case 'O':
                    number = 6; break;
                case 'P': case 'Q': case 'R': case 'S':
                    number = 7; break;
                case 'T': case 'U': case 'V':
                    number = 8; break;
                case 'W': case 'X': case 'Y': case 'Z':
                    number = 9; break;
                default:
                    // Keep non-alphabetic characters like '-' or ' ' as is
                    convertedNumber.append(ch);
                    continue; // Skip adding a number for invalid characters
            }
            convertedNumber.append(number); // Append the mapped number
        }

        // Output the final converted phone number
        System.out.println("The Phone Number is: " + convertedNumber);
    }
}

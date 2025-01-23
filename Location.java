import java.util.Scanner;

public class Location {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns (Ex: 2 3): ");
        int rows = input.nextInt();
        int columns = input.nextInt();
        CreateArray array = new CreateArray(rows, columns);
        array.fillArray(rows, columns);
        array.printArray();
        input.close();
        System.out.println("The maximum value in the array is: "+ array.locateLargest());
    }
}


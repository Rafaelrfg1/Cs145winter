//Name: Rafael Figueora
//Date: 1/17/25
//Assignment: Location program
//Partners: Ben and Kennedi


import java.util.Scanner;



public class Location {
    //Runs the main method and executes everything calling methods from the other class
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


import java.util.Scanner;

public class LinearSearchMain {

    static int sizeOfGivenArray;
    static int[] givenArray;
    static int elementToSearchInGivenArray;

    public static void main(String[] args) {
        // Read input from console for size and data of array
        readInput();
        // Method call to do a liner search of an element in the array prints result based on elements presence
        if(doLinearSearchReturnTrueIfElementIsPresent(givenArray, elementToSearchInGivenArray)) {
            System.out.println("Element is present in given array");
        } else {
            System.out.println("Element is not present in given array");
        }
    }

    // Linear Search Algorithm
    private static boolean doLinearSearchReturnTrueIfElementIsPresent(int[] givenArrayForLinearSearch, int elementToSearch) {
        for(int iteratedElement  : givenArrayForLinearSearch) {
            if (iteratedElement == elementToSearch) {
                return true;
            }
        }
        return false;
    }

    // Method to read input and display the read data
    private static void readInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of Array");
        sizeOfGivenArray = scanner.nextInt();

        givenArray = new int[sizeOfGivenArray];
        System.out.println("Enter elements of Array");
        for(int i = 0; i < sizeOfGivenArray; i++) {
            givenArray[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to search");
        elementToSearchInGivenArray = scanner.nextInt();

        scanner.close();

        // To display the received data
        for(int element  :  givenArray) {
            System.out.print(element);
        }
    }
}

package MThree.Java.Callum;
import java.util.Scanner;

public class WindowMaster {
    public static void main(String[] args) {
        // Declare variables for height and width
        float height = 0;
        float width = 0;

        //Declare variables to hold user input
        String stringHeight = null;
        String stringWidth = null;
        String stringGlass;
        String stringTrim;
        String stringAmount;

        //Declare other variables we need to compute the result
        float areaOfWindow;
        float perimeterOfWindow;
        float costPerWindow;
        float totalCost;
        float glassCost = 0;
        float trimCost = 0;
        float noOfWindows = 0;
        boolean isValid = false;

        //Declare and initialise the scanner for user input
        Scanner myScanner = new Scanner(System.in);

        //Put exceptions in while loop to catch errors in parsing
        //Get user input for height
        do {
            try {
                System.out.println("Please Enter Window Height: ");
                stringHeight = myScanner.nextLine();
                height = Float.parseFloat(stringHeight);
                if (height > 0){
                    isValid = true;
                }
            } catch(NumberFormatException ex){
                System.out.println("That is not a valid Input. Please try again.");
            }
        } while(!isValid);

        //Get User Input for width
        isValid = false;
        do {
            try {
                System.out.println("Please Enter Window Width: ");
                stringWidth = myScanner.nextLine();
                width = Float.parseFloat(stringWidth);
                if (width > 0){
                    isValid = true;
                }
            } catch(NumberFormatException ex){
                System.out.println("That is not a valid Input. Please try again.");
            }
        } while(!isValid);

        //Get user input for glass cost
        isValid = false;
        do {
            try {
                System.out.println("Please Enter cost of Glass/sqft: ");
                stringGlass = myScanner.nextLine();
                glassCost = Float.parseFloat(stringGlass);
                if (glassCost > 0){
                    isValid = true;
                }
            } catch(NumberFormatException ex){
                System.out.println("That is not a valid Input. Please try again.");
            }
        } while(!isValid);

        //Get user input for trim cost
        isValid = false;
        do {
            try {
                System.out.println("Please Enter cost of trim/ft: ");
                stringTrim = myScanner.nextLine();
                trimCost = Float.parseFloat(stringTrim);
                if (trimCost > 0){
                    isValid = true;
                }
            } catch(NumberFormatException ex){
                System.out.println("That is not a valid Input. Please try again.");
            }
        } while(!isValid);

        //Get user input for no of windows requested
        isValid = false;
        do {
            try {
                System.out.println("Please Enter No. of Windows: ");
                stringAmount = myScanner.nextLine();
                noOfWindows = Float.parseFloat(stringAmount);
                if (noOfWindows > 0){
                    isValid = true;
                }
            } catch(NumberFormatException ex){
                System.out.println("That is not a valid Input. Please try again.");
            }
        } while(!isValid);


        //Calculate AREA and PERIMETER of the window
        areaOfWindow = height * width;
        perimeterOfWindow = 2 * (height + width);

        //Calculate cost using hardcoded value of prices
        costPerWindow = ((glassCost * areaOfWindow) + (trimCost * perimeterOfWindow));
        totalCost = noOfWindows * costPerWindow;

        //Print results to sys.out
        System.out.println("Window Height: " + stringHeight);
        System.out.println("Window Width: " + stringWidth);
        System.out.println("Window Area: " + areaOfWindow);
        System.out.println("Window Perimeter: " + perimeterOfWindow);
        System.out.println("Cost Per Window: " + costPerWindow);
        System.out.println("Total Cost: " + totalCost);
    }
}

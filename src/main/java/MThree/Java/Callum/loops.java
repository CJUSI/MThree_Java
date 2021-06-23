package MThree.Java.Callum;

public class loops {
    public static void main(String[] args) {
        ForLoops();
        WhileLoops();
    }

    private static void WhileLoops(){
        //Initialise Variables
        boolean isTrue = true;
        int counter = 0;

        //while loop
        while (isTrue){
            System.out.println("Looping");
            counter++;
            if (counter == 10){
                isTrue = false;
            }
        }

        //Do while loop
        isTrue = true;
        do {
            System.out.println("Doing");
            counter++;
            if (counter == 20){
                isTrue = false;
            }
        } while(isTrue);
    }

    private static void ForLoops(){
        //initialise variables required

        String name = "Callum";

        //For loop 1
        for(int i = 0; i < 10; i++) {
            System.out.println("i Value: " + i);
        }

        //For loop 2
        for (char c : name.toCharArray()){
            System.out.println("Character: " + c);
        }
    }
}

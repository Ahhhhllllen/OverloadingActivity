package IT113.allen;

import java.util.concurrent.atomic.DoubleAccumulator;

public class App {
    
    //the method that have 2 parameters and returns greater integer value
    private static int greaterValue(int num1, int num2){
        return num1 + num2;
    }

    //the method that have 3 parameters and returns the greater double value
    private static Double greaterValue(double num1, double num2, double num3){
        return num1 + num2 + num3;
    }
    public static void main(String[] args) throws Exception {
        
        System.out.println("Hello Mahal kong World!");
        
        //Calling the greaterValue method with integer parameters to display the sum of 2 numbers
         System.out.println("The greater value between 45 and 100 is " + greaterValue(45,100));

        
        //Calling the greaterValue method with double parameters to display the sum of 3 numbers
         System.out.println("The greater value between 3.14, 9.8, and 9.1 is " + greaterValue(3.14,9.8,9.1));

    }
}

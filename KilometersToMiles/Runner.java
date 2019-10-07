import javax.swing.*;
public class Runner
{
    private static double conversionRate = 1.609;
    
    public static void main(String args[]){
        String userInput = JOptionPane.showInputDialog("Enter Miles");
        double userInputDouble = Double.parseDouble(userInput);
        System.out.println(userInputDouble + " Miles Equal To " + mileToKilo(userInputDouble) + " Kilometers");
        
    }
    
    public static double mileToKilo(double mileValue){
        return mileValue * getConversionRate();
    }
    
    public static double getConversionRate(){
        return conversionRate;
    }
    
}
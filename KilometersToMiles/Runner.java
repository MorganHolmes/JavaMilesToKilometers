public class Runner
{
    private static double conversionRate = 1.609;
    
    public static void main(String args[]){
        System.out.println(mileToKilo(3.6));
        
    }
    
    public static double mileToKilo(double mileValue){
        return mileValue * getConversionRate();
    }
    
    public static double getConversionRate(){
        return conversionRate;
    }
    
}
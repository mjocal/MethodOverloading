
package methodoverloading;

/**
 *
 * @author Majo Calderon
 * 
 * Method overloading is using the same method with diff parameters
 * The method MUST return the same variable type (or be void)
 * 
 */
public class MethodOverloading {

    public static void main(String[] args) {
        
        calcFeetAndInchesToCentimeters(7, 5);
        calcFeetAndInchesToCentimeters(-20);
        
        System.out.println("Another version: ");
        
        calcFeetAndInchesToCm(8, 4);
        calcFeetAndInchesToCm(100);
    }
    
    public static double calcFeetAndInchesToCentimeters (double feet, double inches){
        if (inches >= 0 && feet >=0){
            double cm = inches * 2.54;
            System.out.println(inches + " inches are in total " +cm+ "cms");
            cm = feet * (12 * 2.54);
            System.out.println(feet + " feet are in total " +cm+ "cms");
            return cm;
        } else if (inches >= 0) {
            double cm = inches * 2.54;
            System.out.println(inches + " inches are in total " +cm+ "cms");
            return cm;
        } else if (feet >=0) {
            double cm = feet * (12 * 2.54);
            System.out.println(feet + " feet are in total " +cm+ "cms");
            return cm;
        } 
        
        System.out.println("There is no valid data");
        return -1;
    }
    
    public static double calcFeetAndInchesToCentimeters (double inches){
        if (inches >= 0) {
            double feet = inches / 12;
            System.out.println(inches + " inches are in total " +feet+ " feet");
            return feet;
        } 

    System.out.println("There is no valid data");
    return -1;
    }

    public static double calcFeetAndInchesToCm (double feet, double inches){
        
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid data");
            return -1;
        }
        
        double cm = (feet * 12) * 2.54;
        cm += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + cm + "cm");
        return cm;
    }

    public static double calcFeetAndInchesToCm (double inches){
        
        if (inches < 0) {
            return -1;
        }
        
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to: " + feet + " feet "
                + "and " + remainingInches + " inches");
        
        return calcFeetAndInchesToCm(feet, remainingInches);
    }
    
}

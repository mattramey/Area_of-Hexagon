import java.util.Scanner;
import java.lang.Math;

public class Area_Hex {

    public static void main(String[] args) throws Exception {
        System.out.println("Enter the length of a side");


// instantiate Scanner class
        try( Scanner input = new Scanner(System.in)){

// initialize var length
float s =  input.nextFloat();

/*   calculate area of hexagon area = 6* s^2 / 4*tan(PI/6)
 * then convert double to float for output
*/
double myArea = (6 * Math.pow(s, 2) ) / (4 * Math.tan(Math.PI/6)); 



/* change to printf and use "%.2f\n"  ** this changes the format to a float**
 
 */
System.out.printf("%.2f\n", myArea);
        }
    }
}

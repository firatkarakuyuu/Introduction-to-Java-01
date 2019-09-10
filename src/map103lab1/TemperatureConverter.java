package map103lab1;
import java.util.Scanner;
public class TemperatureConverter {
public static void main( String args[] ) {
Scanner in = new Scanner(System.in);
System.out.print("Enter temperature in Celsius: ");
int Celcius = in.nextInt();     
    int i = 0;
int Fahrenheit = Celcius * ((9*i) / 5) + 32;    
System.out.println(Celcius + " degree Celsius is equal to " + Fahrenheit +" degree Fahrenheit.");    
}
}

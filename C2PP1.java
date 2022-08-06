import java.util.Scanner;
public class C2PP1 {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Degrees in Farenheit: ");
        int DegreesF = input.nextInt();

        int  DegreesC = (5*(DegreesF -32)/9);
        System.out.println(DegreesF + " degrees in Fahrenheit is equal to " + DegreesC + " degrees in Celsius");
    }
}
// Author: Anton Sakanovych
// ESKA: s26776

import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        final double mileKilometers = 1.609344;
        final double gallonLiters = 3.785412;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter fuel consumption: ");
        double fuelConsum = scan.nextDouble();
        System.out.println("Enter units(eu or usa)");
        String locale = scan.next();
        double convertedValue = switch (locale){
            case "usa":
                yield (fuelConsum*mileKilometers)/gallonLiters;
            case "eu":
                yield (fuelConsum/mileKilometers)*gallonLiters;
            case default:
                yield 0;
        };

        switch (locale) {
            case "usa" -> System.out.printf("%s mpg = %s l/100km", fuelConsum, convertedValue);
            case "eu" -> System.out.printf("%s l/100km = %s mpg", fuelConsum, convertedValue);
            case default -> System.out.println("Error unknown units");
        }
    }
}

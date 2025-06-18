public class UnitConverter {
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        double yards = 5.0;
        System.out.println(yards + " yards = " + convertYardsToFeet(yards) + " feet");

        double feet = 15.0;
        System.out.println(feet + " feet = " + convertFeetToYards(feet) + " yards");

        double meters = 2.0;
        System.out.println(meters + " meters = " + convertMetersToInches(meters) + " inches");

        double inches = 10.0;
        System.out.println(inches + " inches = " + convertInchesToMeters(inches) + " meters");
        System.out.println(inches + " inches = " + convertInchesToCentimeters(inches) + " centimeters");
    }
}
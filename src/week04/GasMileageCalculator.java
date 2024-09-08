package week04;

public class GasMileageCalculator {
    public static void main(String[] args) {
        int currentOdometer = 80000;
        int previousOdometer = 79700;
        int gasAdded = 12;

        int gasPerMile = (currentOdometer - previousOdometer) / gasAdded;

        System.out.println("gasPerMile = " + gasPerMile);

        System.out.println(gasPerMile >= 25 ? "Good GPM" : "Poor GPM");


    }
}

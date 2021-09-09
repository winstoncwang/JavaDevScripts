public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(95.75);
    }

    public static long toMilesPerHour (double kilometersPerHour){
        if (kilometersPerHour >= 0) {
            double milesPerHour = kilometersPerHour / 1.609d;
            return Math.round(milesPerHour);
        }
        return -1;
    }

    public static void printConversion(double kilometersPerHour) {
        long mileResult = toMilesPerHour(kilometersPerHour);
        if(mileResult != -1) {
            System.out.println(kilometersPerHour + " km/h = " + mileResult + " mi/h");
        }else{
            System.out.println("Invalid Value");
        }
    }
}

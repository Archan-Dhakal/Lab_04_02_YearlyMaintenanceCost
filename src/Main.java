public class Main {
    public static void main(String[] args) {
        double summerMaintenanceCost = 300.00;
        double fallMaintenanceCost = 200.00;
        double winterMaintenanceCost = 350.00;
        double springMaintenanceCost = 250.00;
        double yearlyMaintenanceCost = summerMaintenanceCost + fallMaintenanceCost + winterMaintenanceCost + springMaintenanceCost;
        System.out.println("The yearly maintenance cost is the sum of " + summerMaintenanceCost + ", " + fallMaintenanceCost + ", " + winterMaintenanceCost + " and " + springMaintenanceCost + " which is " + yearlyMaintenanceCost);
    }
}

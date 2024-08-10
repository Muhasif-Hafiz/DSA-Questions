public class Flight {

    private int flightNumber;
    private String destination;
    private float distance;
    private float fuel;

    private void calcFuel() {
        if (distance <= 1000) {
            fuel = 500;
        } else if (distance > 1000 && distance <= 2000) {
            fuel = 1100;
        } else {
            fuel = 2200;
        }
    }


    public void feedInfo() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter Flight Number: ");
        flightNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Destination: ");
        destination = scanner.nextLine();

        System.out.print("Enter Distance: ");
        distance = scanner.nextFloat();

        calcFuel();
    }


    public void showInfo() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Distance: " + distance);
        System.out.println("Fuel: " + fuel);
    }


}

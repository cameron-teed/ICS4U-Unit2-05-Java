/*
* This program receives and outputs information about a car when prompted
*
* @author  Cameron Teed
* @version 1.0
* @since   2021-05-25
*/

// Import the Scanner class
import java.util.Scanner;

final class VehicleMain {

  private VehicleMain() {
    // Prevent instantiation
    // Optional: throw an exception e.g. AssertionError
    // if this ever *is* called
     throw new IllegalStateException("Cannot be instantiated");
  }

  /**
   * This function allows the user to have two cars and change the
   * properties of the cars.
   *
   * @param args
   */
  public static void main(final String[] args) {
    try {
      // Creating the scanners for any inputs that may be necessary input
      final Scanner licenseInput = new Scanner(System.in);
      final Scanner colourInput = new Scanner(System.in);
      final Scanner speedInput = new Scanner(System.in);

      // User input for license plate of first car
      System.out.print("Enter the license plate number of the first car: ");
      String carLicensePlate = licenseInput.nextLine();

      // User input for colour of first car
      System.out.print("Enter the colour of the first car: ");
      String carColour = colourInput.nextLine();
      System.out.println();

      // Initializing the users first car
      Vehicle firstCar = new Vehicle(carLicensePlate, carColour);
      System.out.println("Here is your first car!");
      System.out.println("License Plate Number: " + firstCar.getLicensePlate());
      System.out.println("Colour: " + firstCar.getColour());
      System.out.println();

      // User input for license plate of second car
      System.out.print("Enter the license plate number of the second car: ");
      carLicensePlate = licenseInput.nextLine();

      // User input for colour of second car
      System.out.print("Enter the colour of the second car: ");
      carColour = colourInput.nextLine();
      System.out.println();

      // Initializing the users second car
      Vehicle secondCar = new Vehicle(carLicensePlate, carColour);
      System.out.println("Here is your second car!");
      System.out.println("License Plate Number: "
                         + secondCar.getLicensePlate());
      System.out.println("Colour: " + secondCar.getColour());
      System.out.println();

      // Changing the license plate number of the first car
      System.out.print("Uh oh! You need to change your license plate!: ");
      String carLicensePlateChange = licenseInput.nextLine();
      firstCar.setLicensePlate(carLicensePlateChange);
      System.out.println("Your new license plate number is: "
                         + firstCar.getLicensePlate());
      System.out.println();

      // Changing the colour of the second car
      System.out.print("You chipped the paint! Repaint your second car!: ");
      String carColourChange = colourInput.nextLine();
      secondCar.setColour(carColourChange);
      System.out.println("The colour of your new paint job is: "
                         + secondCar.getColour());
      System.out.println();

      // Accelerating
      System.out.print("You're cruising on the road, enter your speed (km/h)! ");
      int carSpeedChange = speedInput.nextInt();
      System.out.println("The car is travelling at "
                         + firstCar.accelerate(carSpeedChange) + " km/h");
      System.out.println();

      // Deceleration
      System.out.print("Enter how much you want to decelerate: ");
      carSpeedChange = speedInput.nextInt();
      System.out.println("The car is travelling at "
                         + firstCar.deccelerate(carSpeedChange) + " KM/h");
      System.out.println("\nDone.");

      // Catches and tells the user what error occurred
    } catch (NullPointerException e) {
      System.out.println("");
      System.out.println("ERROR: Attempt to change car "
                         + "property beyond the limit.");
    } catch (Exception e) {
      System.out.println("");
      System.out.println("ERROR: Invalid Input");
    }
  }
}

/*
* This class holds information about a vehicle.
*
* @author  Cameron Teed
* @version 1.0
* @since   2021-05-25
*/

public class Vehicle {
  /**
   * initializing the license plate.
   */
  private String licensePlate;
  /**
   * initializing the colour.
   */
  private String colour;
  /**
   * initializing the doors.
   */
  private int numberOfDoors;
  /**
   * initializing the speed.
   */
  private int speed;
  /**
   * initializing the max speed.
   */
  private int maximumSpeed;
  /**
   * initializing the max speed.
   */
  private final int doors = 4;
  /**
   * initializing the max speed.
   */
  private final int maxSpeed = 200;

  /**
   * Setting field values with a constructor.
   *
   * @param licensePlateInput
   * @param colourInput
   */
  public Vehicle(final String licensePlateInput, final String colourInput) {
    this.licensePlate = licensePlateInput;
    this.colour = colourInput;
    this.numberOfDoors = doors;
    this.speed = 0;
    this.maximumSpeed = maxSpeed;
  }

  /**
   * Setter for the colour.
   *
   * @param userColour
   */
  public void setColour(final String userColour) {
    colour = userColour;
  }

  /**
   * Getter for the colour.
   *
   * @return colour
   */
  public String getColour() {
    return colour;
  }

  /**
   * Setter for the license plate number.
   *
   * @param userLicensePlate
   */
  public void setLicensePlate(final String userLicensePlate) {
    licensePlate = userLicensePlate;
  }

  /**
   * Getter for the license plate number.
   *
   * @return licensePlate
   */
  public String getLicensePlate() {
    return licensePlate;
  }

  /**
   * Method that accelerates the car.
   *
   * @param userIncrease
   * @return speed
   */
  public int accelerate(final int userIncrease) throws Exception {
    // Checking to see if speed exceeds maximum then increasing the speed
    if (this.speed + userIncrease > this.maximumSpeed) {
      throw null;
    } else {
      this.speed = this.speed + userIncrease;
    }

    // Returning the new speed to the user
    return this.speed;
  }

  /**
   * Method that deccelerates the car.
   *
   * @param userDecrease
   * @return speed
   */
  public int deccelerate(final int userDecrease) throws Exception {
    // Checking to see if speed exceeds maximum then increasing the speed
    if (this.speed - userDecrease < 0) {
      throw null;
    } else {
      this.speed = this.speed - userDecrease;
    }

    // Returning the new speed to the user
    return this.speed;
  }
}

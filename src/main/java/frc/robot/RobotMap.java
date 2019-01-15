/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;
  
  //DONT SET THESE TO 1
  private static final double translationalDeadZone = 0.1;
  private static final double rotationalDeadZone = 0.1;

  private static int frontLeft = 1;
  private static int frontRight = 2;
  private static int backLeft = 3;
  private static int backRight = 4;

  public static int getBackLeft() {
      return backLeft;
  }
  public static int getBackRight() {
      return backRight;
  }
  public static int getFrontLeft() {
      return frontLeft;
  }
  public static int getFrontRight() {
      return frontRight;
  }

  /**
   * @return the rotationaldeadzone
   */
  public static double getRotationaldeadzone() {
    return rotationalDeadZone;
  }

  /**
   * @return the translationaldeadzone
   */
  public static double getTranslationaldeadzone() {
    return translationalDeadZone;
  }

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}

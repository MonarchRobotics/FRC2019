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

  private final static int frontLeft = 1;
  private final static int frontRight = 2;
  private final static int backLeft = 3;
  private final static int backRight = 4;

  private final static int spark1 = 5;
  private final static int spark2 = 6;
  private final static int spark3 = 7;

  private static final int raiseFrontLeft = 8;
  private static final int raiseFrontRight = 9;
  private static final int raiseBackLeft = 10;
  private static final int raiseBackRight = 11;
  private static final int leftWheel = 12;
  private static final int rightWheel = 13;

  private static final int openChannel = 1;
  private static final int releaseChannel = 2;

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

  public static int getRaiseFrontLeft() {
      return raiseFrontLeft;
  }
  public static int getRaiseFrontRight() {
      return raiseFrontRight;
  }
  public static int getRaiseBackLeft() {
      return raiseBackLeft;
  }
  public static int getRaiseBackRight() {
      return raiseBackRight;
  }
  public static int getLeftWheel() {
      return leftWheel;
  }
  public static int getRightWheel() {
      return rightWheel;
  }

  public static int getOpenChannel() {
      return openChannel;
  }

  public static int getReleaseChannel() {
      return releaseChannel;
  }

  public static double getRotationaldeadzone() {
    return rotationalDeadZone;
  }

  public static double getTranslationaldeadzone() {
    return translationalDeadZone;
  }

  public static int getSpark1() {
      return spark1;
  }
  public static int getSpark2() {
      return spark2;
  }
  public static int getSpark3() {
      return spark3;
  }

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}

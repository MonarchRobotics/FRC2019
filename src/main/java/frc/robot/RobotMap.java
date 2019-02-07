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

  private final static int frontLeft = 4;
  private final static int frontRight = 1;
  private final static int backLeft = 3;
  private final static int backRight = 2;

  private final static int spark = 0;

  private static final int LowerWheelLeft = 0;
  private static final int LowerWheelRight = 0;
  private static final int RaiseFront = 1;
  private static final int RaiseBack = 15;

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

  
  public static int getLowerWheelLeft() {
    return LowerWheelLeft;
  }
  public static int getLowerWheelRight() {
      return LowerWheelRight;
  }
  public static int getRaiseFront() {
      return RaiseFront;
  }
  public static int getRaiseBack() {
    return RaiseBack;
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

  public static int getSpark() {
      return spark;
  }

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}

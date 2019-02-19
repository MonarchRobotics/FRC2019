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
  private static final double translationalDeadZone = 0.05;
  private static final double rotationalDeadZone = 0.05;

  private final static int atharvsfrontLeftLeg = 4;
  private final static int atharvsfrontRightLeg = 1;
  private final static int atharvsbackLeftLeg = 3;
  private final static int atharvsbackRightLeg = 2;

  private final static int atharvsArm = 0;

  private static final int atharvWalker = 2;
  private static final int atharvPushUpFront = 4;
  private static final int atharvPushUpBack = 3;

  private static final int openChannel = 1;
  private static final int releaseChannel = 2;
  private static final int atharvsMouth = 0;

  private static final int atharvsBackMuscle= 1;
  private static final int atharvsChestMuscle = 9;

  public static int getBackLeft() {
      return atharvsbackLeftLeg;
  }
  public static int getBackRight() {
      return atharvsbackRightLeg;
  }
  public static int getFrontLeft() {
      return atharvsfrontLeftLeg;
  }
  public static int getFrontRight() {
      return atharvsfrontRightLeg;
  }

  public static int getLowerWheel() {
      return atharvWalker;
  }
  public static int getRaiseFront() {
      return atharvPushUpFront;
  }
  public static int getRaiseBack() {
    return atharvPushUpBack;
  }

  public static int getOpenChannel() {
      return openChannel;
  }

  public static int getReleaseChannel() {
      return releaseChannel;
  }
  public static int getCompressor() {
      return atharvsMouth;
  }

  public static double getRotationaldeadzone() {
    return rotationalDeadZone;
  }

  public static double getTranslationaldeadzone() {
    return translationalDeadZone;
  }

  public static int getSpark() {
      return atharvsArm;
  }

  public static int getRearLimitSwitch() {
      return atharvsBackMuscle;
  }
  public static int getFrontLimitSwitch() {
      return atharvsChestMuscle;
  }

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}

/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.Climb;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

/**
 * Add your docs here.
 */
public class LowRider extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public WPI_TalonSRX frontLeft, frontRight, backLeft, backRight, leftWheel, rightWheel;
  
  public LowRider(int frontLeft, int frontRight, int backLeft, int backRight, int leftWheel, int rightWheel) {
    this.frontLeft = new WPI_TalonSRX(frontLeft);
    this.frontRight = new WPI_TalonSRX(frontRight);
    this.backLeft = new WPI_TalonSRX(backLeft);
    this.backRight = new WPI_TalonSRX(backRight);
    this.leftWheel = new WPI_TalonSRX(leftWheel);
    this.rightWheel = new WPI_TalonSRX(rightWheel);

    this.frontLeft.setNeutralMode(NeutralMode.Brake);
    this.frontRight.setNeutralMode(NeutralMode.Brake);
    this.backLeft.setNeutralMode(NeutralMode.Brake);
    this.backRight.setNeutralMode(NeutralMode.Brake);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new Climb());
  }
}

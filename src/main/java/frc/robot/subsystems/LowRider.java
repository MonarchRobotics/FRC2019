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
  public WPI_TalonSRX RaiseFrontLeft, RaiseFrontRight, RaiseBackLeft, RaiseBackRight, leftWheel, rightWheel;
  
  public LowRider(int frontLeft, int frontRight, int backLeft, int backRight, int leftWheel, int rightWheel) {
    this.RaiseFrontLeft = new WPI_TalonSRX(frontLeft);
    this.RaiseFrontRight = new WPI_TalonSRX(frontRight);
    this.RaiseBackLeft = new WPI_TalonSRX(backLeft);
    this.RaiseBackRight = new WPI_TalonSRX(backRight);
    this.leftWheel = new WPI_TalonSRX(leftWheel);
    this.rightWheel = new WPI_TalonSRX(rightWheel);

    this.RaiseFrontLeft.setNeutralMode(NeutralMode.Brake);
    this.RaiseFrontRight.setNeutralMode(NeutralMode.Brake);
    this.RaiseBackLeft.setNeutralMode(NeutralMode.Brake);
    this.RaiseBackRight.setNeutralMode(NeutralMode.Brake);
  }


  // Extends all legs of the 'LowRider' (Initial function for the LowRider sequence)
  public void LowRiderUp(){
    RaiseFrontLeft.set(0.5);
    RaiseFrontRight.set(0.5);
    RaiseBackLeft.set(0.5);
    RaiseBackRight.set(0.5);
  }

  // Retracts front wheels
  public void FrontUp(){
    RaiseFrontLeft.set(-0.5);
    RaiseFrontRight.set(-0.5);
  }

  // Retracts back wheels
  public void BackUp(){
    RaiseBackLeft.set(-0.5);
    RaiseBackRight.set(-0.5);
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new Climb());
  }
}

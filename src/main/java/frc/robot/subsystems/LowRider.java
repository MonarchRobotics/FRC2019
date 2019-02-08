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
  public WPI_TalonSRX LowerWheelRight, LowerWheelLeft, RaiseFront, RaiseBack;
  
  public LowRider(int LowerWheelRight, int LowerWheelLeft, int RaiseFront, int RaiseBack) {
    this.LowerWheelRight = new WPI_TalonSRX(LowerWheelRight);
    this.LowerWheelLeft = new WPI_TalonSRX(LowerWheelLeft);
    this.RaiseFront = new WPI_TalonSRX(RaiseFront);
    this.RaiseBack = new WPI_TalonSRX(RaiseBack);

    this.RaiseFront.setNeutralMode(NeutralMode.Brake);
    this.RaiseBack.setNeutralMode(NeutralMode.Brake);


  }

  /**
   * @return the lowerWheel
   */
  public WPI_TalonSRX getLowerWheelLeft() {
    return LowerWheelLeft;
  }

  /**
   * @return the lowerWheel
   */
  public WPI_TalonSRX getLowerWheelRight() {
    return LowerWheelRight;
  }

  /**
   * @return the raiseBack
   */
  public WPI_TalonSRX getRaiseBack() {
    return RaiseBack;
  }

  /**
   * @return the raiseFront
   */
  public WPI_TalonSRX getRaiseFront() {
    return RaiseFront;
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    // setDefaultCommand(new Climb());
  }
}

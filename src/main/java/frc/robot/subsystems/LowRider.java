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
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.DigitalInput;

/**
 * Add your docs here.
 */
public class LowRider extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public Talon LowerWheel, RaiseFront, RaiseBack;
  private DigitalInput rearSwitch, frontSwitch;
  
  public LowRider(int LowerWheelRight,int RaiseFront, int RaiseBack, int rearSwitch, int frontSwitch) {
    this.LowerWheel = new Talon(LowerWheelRight);

    this.RaiseFront = new Talon(RaiseFront);
    this.RaiseBack = new Talon(RaiseBack);

    this.rearSwitch = new DigitalInput(rearSwitch);
    this.frontSwitch = new DigitalInput(frontSwitch);
  }

  /**
   * @return the lowerWheel
   */
  public Talon getLowerWheel() {
    return LowerWheel;
  }

  /**
   * @return the raiseBack
   */
  public Talon getRaiseBack() {
    return RaiseBack;
  }

  /**
   * @return the raiseFront
   */
  public Talon getRaiseFront() {
    return RaiseFront;
  }

  public boolean getRearSwitch() {
    return rearSwitch.get();
  }
  public boolean getFrontSwitch() {
    return frontSwitch.get();
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new Climb());
  }
}

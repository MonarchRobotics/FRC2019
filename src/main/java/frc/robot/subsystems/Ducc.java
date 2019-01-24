/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.Grabber;

/**
 * Add your docs here.
 */
public class Ducc extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private DoubleSolenoid grabberSolenoid;

  public Ducc(int openChannel, int closeChannel) {
    grabberSolenoid = new DoubleSolenoid(openChannel, closeChannel);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new Grabber());
    SmartDashboard.putBoolean("Open", true);
  }

  public void openDucc() {
    grabberSolenoid.set(DoubleSolenoid.Value.kForward);
    SmartDashboard.putBoolean("Open", false);
  }
  public void closeDucc() {
    grabberSolenoid.set(DoubleSolenoid.Value.kReverse);
  }

  public DoubleSolenoid.Value getValue() {
    return grabberSolenoid.get();
  }
}

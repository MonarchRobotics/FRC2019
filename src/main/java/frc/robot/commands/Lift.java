/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.OI;
import com.revrobotics.CANEncoder;

/**
 * An example command.  You can replace me with your own command.
 */
public class Lift extends Command {
  public Lift() {
    // requires(Robot.m_subsystem);
    requires(Robot.lift);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    System.out.println(Robot.lift.getSpark().getEncoder().getPosition());
    if(OI.controller.getXButton()){
      Robot.lift.getSpark().set(0.5);
    }
    else if(OI.controller.getYButton()){
      Robot.lift.getSpark().set(-0.5);
      //12.5 rotations
      //20.0 rotations
    }
    else{
      Robot.lift.getSpark().set(0);
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // // Called once after isFinished returns true
  // @Override
  // protected void end() {
  // }

  // // Called when another command which requires one or more of the same
  // // subsystems is scheduled to run
  // @Override
  // protected void interrupted() {
  // }
}

/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;

public class Climb extends Command {
  public Climb() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.climber);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    // B raises the whole thing
    if (OI.controller.getBButton())
    {
      Robot.climber.getRaiseFront().set(0.5);
      Robot.climber.getRaiseBack().set(0.5);
    }
    else
    {
      Robot.climber.getRaiseFront().set(0);
      Robot.climber.getRaiseBack().set(0);
    }

    // Lowers the front
    if (OI.controller.getBumper(Hand.kRight)) {
      Robot.climber.getRaiseFront().set(-0.5);
    }
    else
    {
      Robot.climber.getRaiseFront().set(0);
    }

    // Lowers the back
    if (OI.controller.getBumper(Hand.kLeft)) {
      Robot.climber.getRaiseBack().set(-0.5);
    }
    else
    {
      Robot.climber.getRaiseBack().set(0);
    }

    // Moves the low rider wheels
    double WheelSpeed = OI.controller.getTriggerAxis(GenericHID.Hand.kRight);
    Robot.climber.getLowerWheelRight().set(WheelSpeed);
    Robot.climber.getLowerWheelLeft().set(WheelSpeed);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}

/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;
import edu.wpi.first.wpilibj.BuiltInAccelerometer;

public class Climb extends Command {
  double frontSpeed;
  double backSpeed;
  Accelerometer accel;
  public Climb() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.climber);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    frontSpeed = 1.0;
    backSpeed = 1.0;
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    // B raises the whole thing
    
    // Does + thingys mean pulling legs up or pushing legs down
    if(OI.controller.getBumper(GenericHID.Hand.kLeft)  && !Robot.climber.getRearSwitch()){
      Robot.climber.getRaiseBack().set(1.0);
    }
    else{
      Robot.climber.getRaiseBack().set(-OI.controller.getTriggerAxis(GenericHID.Hand.kLeft));
    }

    if(OI.controller.getBumper(GenericHID.Hand.kRight) && !Robot.climber.getFrontSwitch()){
      Robot.climber.getRaiseFront().set(1.0);
    }
    else{
      Robot.climber.getRaiseFront().set(-OI.controller.getTriggerAxis(GenericHID.Hand.kRight));
    }
    // if (OI.controller.getBButton())
    // {
    //   Robot.climber.getRaiseFront().set(0.5);
    //   Robot.climber.getRaiseBack().set(0.5);
    // }
    // else if (OI.controller.getBumper(Hand.kRight) && !Robot.climber.getFrontSwitch()){
    //   Robot.climber.getRaiseFront().set(-0.5);
    // }
    // else if (OI.controller.getBumper(Hand.kLeft) && !Robot.climber.getRearSwitch()){
    //   Robot.climber.getRaiseBack().set(-0.5);
    // }
    // else
    // {
    //   Robot.climber.getRaiseFront().set(0);
    //   Robot.climber.getRaiseBack().set(0);
    // }

    // // Moves the low rider wheels
    // double WheelSpeed = OI.controller.getTriggerAxis(GenericHID.Hand.kRight);
    if(OI.controller.getYButton()){
      Robot.climber.getLowerWheel().set(-1.0);
    }
    else{
      Robot.climber.getLowerWheel().set(0.0);
    }
    
// && !Robot.climber.getRearSwitch() && !Robot.climber.getFrontSwitch()
    if(OI.controller.getStartButton()){
      accel = new BuiltInAccelerometer(); 
      double x = accel.getY();
      System.out.println("accel: "+x);
      
      if(x>0){
        if(frontSpeed>=1){
          if(backSpeed>=0){
            backSpeed-=Math.abs(x)/2.5;
          }
          else{
            frontSpeed+=Math.abs(x)/2.5;
            frontSpeed = 1.0;
          }
        }
        else{
          frontSpeed+=Math.abs(x)/2.5;
        }
      }
      else if(x<0){
        if(backSpeed>=1){
          if(frontSpeed>=0){
            frontSpeed-=Math.abs(x)/2.5;
          }
          else{
            backSpeed+=Math.abs(x)/2.5;
            backSpeed = 1.0;
          }
        }
        else{
          backSpeed+=Math.abs(x)/2.5;
        }
      }
      System.out.println("Front Speed: "+frontSpeed);
      System.out.println("Back Speed: "+backSpeed);
      Robot.climber.getRaiseFront().set(-frontSpeed);
      Robot.climber.getRaiseBack().set(-backSpeed);
    }
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

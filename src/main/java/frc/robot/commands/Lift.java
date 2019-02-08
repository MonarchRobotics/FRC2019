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
  boolean lifting;
  int liftingTo;//0 is lowered, 1 is 2nd level, 2 is 3rd level
  public Lift() {
    // requires(Robot.m_subsystem);
    lifting = false;
    liftingTo=0;
    requires(Robot.lift);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    int pov = OI.controller.getPOV();

    if(!lifting){
      if(pov==270){
        Robot.lift.getSpark().set(-0.5);
        lifting = true;
        liftingTo = 0;
      }
      if(pov==0){
        Robot.lift.getSpark().set(0.5);
        lifting = true;
        liftingTo = 2;
      }
      if(pov==90){
        Robot.lift.getSpark().set(0.5);
        lifting = true;
        liftingTo = 1;
      }
    }
    else if(pov==180){
      stopMoving();
    }
    else{
      if(liftingTo==0 && Robot.lift.getSpark().getEncoder().getPosition()<=0){
        stopMoving();
      }
      else if(liftingTo==1 && Robot.lift.getSpark().getEncoder().getPosition()>=12.5*36){
        stopMoving();
      }
      else if(liftingTo==2 && Robot.lift.getSpark().getEncoder().getPosition()>=20*36){
        stopMoving();
      }
    
    }
  }

  void stopMoving(){
    Robot.lift.getSpark().set(0);
    lifting = false;
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

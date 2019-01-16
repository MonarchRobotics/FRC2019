/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Spark;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class LiftSystem extends Subsystem {
  private Spark spark1, spark2, spark3;

  public LiftSystem(int port1, int port2, int port3){
    spark1 = new Spark(port1);
    spark2 = new Spark(port2);
    spark3 = new Spark(port3);
  }

  public Spark getSpark1() {
    return spark1;
  }

  public Spark getSpark2() {
    return spark2;
  }

  public Spark getSpark3() {
    return spark3;
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}

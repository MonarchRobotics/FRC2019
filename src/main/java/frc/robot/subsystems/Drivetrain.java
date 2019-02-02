/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.commands.DriveMecanum;
import com.ctre.phoenix.motorcontrol.NeutralMode;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Drivetrain extends Subsystem {

    protected MecanumDrive drive;

    public WPI_TalonSRX frontLeft, frontRight, backLeft, backRight;

    public Drivetrain(int frontLeft, int frontRight, int backLeft, int backRight){
        this.frontLeft = new WPI_TalonSRX(frontLeft);
        this.frontRight = new WPI_TalonSRX(frontRight);
        this.backLeft = new WPI_TalonSRX(backLeft);
        this.backRight = new WPI_TalonSRX(backRight);

        this.frontLeft.setNeutralMode(NeutralMode.Brake);
        this.frontRight.setNeutralMode(NeutralMode.Brake);
        this.backLeft.setNeutralMode(NeutralMode.Brake);
        this.backRight.setNeutralMode(NeutralMode.Brake);

        this.frontLeft.setInverted(true);
        this.frontRight.setInverted(true);
        this.backLeft.setInverted(true);
        this.backRight.setInverted(true);

        drive = new MecanumDrive(this.frontLeft, this.backLeft, this.frontRight, this.backRight);
    }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new DriveMecanum());
  }


  public MecanumDrive getDrivetrain() {
      return drive;
  }
}

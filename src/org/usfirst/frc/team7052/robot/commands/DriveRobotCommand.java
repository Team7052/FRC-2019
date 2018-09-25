package org.usfirst.frc.team7052.robot.commands;

import org.usfirst.frc.team7052.robot.OI;
import org.usfirst.frc.team7052.robot.RobotMap;
import org.usfirst.frc.team7052.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveRobotCommand extends Command {
	public DriveTrain drivetrain;
	public OI oi;

    public DriveRobotCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }
    public DriveRobotCommand(OI oi) {
    	this.oi=oi;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	drivetrain = DriveTrain.getInstance();
    	requires(drivetrain);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	drivetrain.tankDrive(oi.getAxis(RobotMap.leftAxisY), oi.getAxis(RobotMap.rightAxisX));
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

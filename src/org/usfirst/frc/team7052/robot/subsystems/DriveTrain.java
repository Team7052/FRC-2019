package org.usfirst.frc.team7052.robot.subsystems;


import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team7052.robot.RobotMap;

/**
 *
 */
public class DriveTrain extends Subsystem {
	/* you don't need to redefine local variables from RobotMap.
	 * Instead, you want to use the constants from RobotMap to connect to your hardware.
	 * eg: Spark frontLeftMotor = new Spark(RobotMap.frontLeftMotor); */
	
	/* un-indent this so that it's same as init default command place */
    	int frontLeftMotor = RobotMap.frontLeftMotor;
    	int frontRightMotor = RobotMap.frontRightMotor;
    	int backLeftMotor = RobotMap.backLeftMotor;
    	int backRightMotor = RobotMap.backRightMotor;
    	

    public void initDefaultCommand() {
    }
    
    
}




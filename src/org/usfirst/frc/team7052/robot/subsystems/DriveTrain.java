package org.usfirst.frc.team7052.robot.subsystems;


import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import org.usfirst.frc.team7052.robot.RobotMap;

/**
 *
 */
public class DriveTrain extends Subsystem {
	/* you don't need to redefine local variables from RobotMap.
	 * Instead, you want to use the constants from RobotMap to connect to your hardware.
	 * eg: Spark frontLeftMotor = new Spark(RobotMap.frontLeftMotor); */
	
    public SpeedControllerGroup leftGroup;
    public SpeedControllerGroup rightGroup;
    public DifferentialDrive drive;
    
    private DriveTrain() {
    	Spark frontLeftMotor = new Spark(RobotMap.frontLeftMotor);
        Spark frontRightMotor = new Spark(RobotMap.frontRightMotor);
        Spark backLeftMotor = new Spark(RobotMap.backLeftMotor);
        Spark backRightMotor = new Spark(RobotMap.backRightMotor);
        
        leftGroup = new SpeedControllerGroup(frontLeftMotor, backLeftMotor);
        rightGroup = new SpeedControllerGroup(frontRightMotor, backRightMotor);
        
        drive = new DifferentialDrive(leftGroup, rightGroup);
       
        
    }
    
    private static DriveTrain instance;
    
    public static DriveTrain getInstance() {
    	if(instance== null) instance = new DriveTrain();
    	return instance;
    }
    
    public void tankDrive(double leftAxisValue, double rightAxisValue) {
    	drive.tankDrive(leftAxisValue, rightAxisValue);
    }
    	

    public void initDefaultCommand() {
    }
    
    
}




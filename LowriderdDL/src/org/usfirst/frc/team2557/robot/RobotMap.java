package org.usfirst.frc.team2557.robot;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//Drive train
	public static CANTalon winch;
	public static CANTalon frontLeft;
	public static CANTalon backLeft;
	public static CANTalon frontRight;
	public static CANTalon backRight;
	public static RobotDrive robotDrive;
	//Intake
	public static CANTalon intakeMotor;	
	public static DoubleSolenoid intakeArm;	

	public static DoubleSolenoid winchLock;
	public static DoubleSolenoid superShifter;
	public static Counter encoderLeftDrive;
	public static Counter encoderRightDrive;
	public static Counter encoderWinch;
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}

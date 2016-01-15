package org.usfirst.frc.team2557.robot;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//Drive train
	public static CANTalon frontLeft = new CANTalon(4);
	public static CANTalon backLeft = new CANTalon(0);
	public static CANTalon frontRight = new CANTalon(5);
	public static CANTalon backRight = new CANTalon(1);
	public static RobotDrive robotDrive;
	
	//Intake
	public static CANTalon intakeMotor = new CANTalon(3);	
	public static DoubleSolenoid intakeArmSol = new DoubleSolenoid(0, 4, 5);	
	
	public static CANTalon winch = new CANTalon(2);
	public static DoubleSolenoid winchLockSol = new DoubleSolenoid(0, 0, 1);
	public static DoubleSolenoid superShifterSol = new DoubleSolenoid(0, 4, 5);
	public static Counter encoderLeftDrive;
	public static Counter encoderRightDrive;
	public static Counter encoderWinch;
	
	public static void init(){
		robotDrive = new RobotDrive(backLeft, backRight, frontLeft, frontRight);
		robotDrive.setSafetyEnabled(false);
		
		
		
	}
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}

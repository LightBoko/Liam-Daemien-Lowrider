package org.usfirst.frc.team2557.robot.commands;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Auto_Drive2 extends Command {

    public Auto_Drive2() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {

    	
    	
    	RobotMap.robotDrive.arcadeDrive(0, -1);
    	RobotMap.robotDrive.arcadeDrive(-1, 1);
    	
    	RobotMap.robotDrive.arcadeDrive(0, 0);
    	
    	RobotMap.robotDrive.arcadeDrive(-1, 0);
    	
    	RobotMap.robotDrive.arcadeDrive(0, 0);
    	
    	RobotMap.robotDrive.arcadeDrive(0, -1);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {

    	RobotMap.robotDrive.arcadeDrive(0, 0);
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

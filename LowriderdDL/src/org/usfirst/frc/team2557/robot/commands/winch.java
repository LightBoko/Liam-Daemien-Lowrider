package org.usfirst.frc.team2557.robot.commands;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class winch extends Command {

    public winch() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.intakeSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
if (Robot.oi.gamepad1.getRawButton(6)){
    		
    		RobotMap.winch.set(1);
    	}
    	else if (RobotMap.intakeArmSol.get() == Value.kReverse && Robot.oi.gamepad1.getRawButton(5)){
    			
    			RobotMap.winch.set(1);
    	}
    	else if (RobotMap.intakeArmSol.get() == Value.kForward && Robot.oi.gamepad1.getRawButton(5)){
    			
    			RobotMap.winch.set(-1);
    	}
    	else{
    		RobotMap.winch.set(0);}
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

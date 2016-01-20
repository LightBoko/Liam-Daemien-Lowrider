package org.usfirst.frc.team2557.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick gamepad1;
	public Joystick gamepad2;
	
	public JoystickButton buttonA1;
	public JoystickButton buttonB1;
	public JoystickButton buttonX1;
	public JoystickButton buttonY1;
	public JoystickButton buttonLB1;
	public JoystickButton buttonRB1;
	public JoystickButton buttonBack1;
	public JoystickButton buttonStart1;
	public JoystickButton buttonLJ1;
	public JoystickButton buttonRJ1;
	
	public JoystickButton buttonA2;
	public JoystickButton buttonB2;
	public JoystickButton buttonX2;
	public JoystickButton buttonY2;
	public JoystickButton buttonLB2;
	public JoystickButton buttonRB2;
	public JoystickButton buttonBack2;
	public JoystickButton buttonStart2;
	public JoystickButton buttonLJ2;
	public JoystickButton buttonRJ2;
	Joystick drivetrain;
	
	
	public OI(){
		gamepad1 = new Joystick(0);
		gamepad2 = new Joystick(1);
		
		buttonA1 	 = new JoystickButton(gamepad1,0);
		buttonB1 	 = new JoystickButton(gamepad1,1);
		buttonX1 	 = new JoystickButton(gamepad1,2);
		buttonY1     = new JoystickButton(gamepad1,3);
		buttonLB1    = new JoystickButton(gamepad1,4);
		buttonRB1    = new JoystickButton(gamepad1,5);
		buttonBack1  = new JoystickButton(gamepad1,6);
		buttonStart1 = new JoystickButton(gamepad1,7);
		buttonLJ1    = new JoystickButton(gamepad1,8);
		buttonRJ1    = new JoystickButton(gamepad1,9);
		
		buttonA2	 = new JoystickButton(gamepad2,0);
		buttonB2 	 = new JoystickButton(gamepad2,1);
		buttonX2 	 = new JoystickButton(gamepad2,2);
		buttonY2     = new JoystickButton(gamepad2,3);
		buttonLB2    = new JoystickButton(gamepad2,4);
		buttonRB2    = new JoystickButton(gamepad2,5);
		buttonBack2  = new JoystickButton(gamepad2,6);
		buttonStart2 = new JoystickButton(gamepad2,7);
		buttonLJ2    = new JoystickButton(gamepad2,8);
		buttonRJ2    = new JoystickButton(gamepad2,9);
	}
    public Joystick getGamepad1() {
    	return gamepad1;
    }
    public Joystick getGamepad2() {
    	return gamepad2;
    }
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}


package org.usfirst.frc.team5288.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team5288.robot.commands.TestMotor;
import edu.wpi.first.wpilibj.VictorSP;
import org.usfirst.frc.team5288.robot.RobotMap;
/**
 *
 */

	

public class DriveTrain extends Subsystem {

	private VictorSP liftMotor1 = new VictorSP(RobotMap.LiftMotor);// Lift Motor
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new TestMotor());
    }
    
    public void outputToMotors(double pwrLeft){
		liftMotor1.set(pwrLeft);
		
	}
}


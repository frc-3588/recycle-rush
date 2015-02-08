// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3588;
    
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController wheelArmsLeftWheelAq;
    public static DigitalInput wheelArmsLimitSwitchAq;
    public static SpeedController wheelArmsRightWheelAq;
    public static SpeedController liftingLiftMotor;
    public static Encoder liftingShaftEncoder;
    public static Compressor liftingCompressor;
    public static DoubleSolenoid liftingLiftArmsSolenoid;
    public static DigitalInput liftingLiftLimit;
    public static SpeedController driveMotorsBackLeft;
    public static SpeedController driveMotorsFrontLeft;
    public static SpeedController driveMotorsFrontRight;
    public static SpeedController driveMotorsBackRight;
    public static RobotDrive driveMotorsRobotDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        wheelArmsLeftWheelAq = new Victor(1);
        LiveWindow.addActuator("WheelArms", "LeftWheelAq", (Victor) wheelArmsLeftWheelAq);
        
        wheelArmsLimitSwitchAq = new DigitalInput(2);
        LiveWindow.addSensor("WheelArms", "LimitSwitchAq", wheelArmsLimitSwitchAq);
        
        wheelArmsRightWheelAq = new Victor(0);
        LiveWindow.addActuator("WheelArms", "RightWheelAq", (Victor) wheelArmsRightWheelAq);
        
        liftingLiftMotor = new Victor(2);
        LiveWindow.addActuator("Lifting", "LiftMotor", (Victor) liftingLiftMotor);
        
        liftingShaftEncoder = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("Lifting", "ShaftEncoder", liftingShaftEncoder);
        liftingShaftEncoder.setDistancePerPulse(1.0);
        liftingShaftEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        liftingCompressor = new Compressor(10);
        
        
        liftingLiftArmsSolenoid = new DoubleSolenoid(10, 4, 7);      
        LiveWindow.addActuator("Lifting", "LiftArmsSolenoid", liftingLiftArmsSolenoid);
        
        liftingLiftLimit = new DigitalInput(3);
        LiveWindow.addSensor("Lifting", "LiftLimit", liftingLiftLimit);
        
        driveMotorsBackLeft = new Victor(8);
        LiveWindow.addActuator("DriveMotors", "BackLeft", (Victor) driveMotorsBackLeft);
        
        driveMotorsFrontLeft = new Victor(9);
        LiveWindow.addActuator("DriveMotors", "FrontLeft", (Victor) driveMotorsFrontLeft);
        
        driveMotorsFrontRight = new Victor(7);
        LiveWindow.addActuator("DriveMotors", "FrontRight", (Victor) driveMotorsFrontRight);
        
        driveMotorsBackRight = new Victor(6);
        LiveWindow.addActuator("DriveMotors", "BackRight", (Victor) driveMotorsBackRight);
        
        driveMotorsRobotDrive = new RobotDrive(driveMotorsBackLeft, driveMotorsFrontLeft,
              driveMotorsFrontRight, driveMotorsBackRight);
        
        driveMotorsRobotDrive.setSafetyEnabled(true);
        driveMotorsRobotDrive.setExpiration(0.1);
        driveMotorsRobotDrive.setSensitivity(0.5);
        driveMotorsRobotDrive.setMaxOutput(1.0);


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
                
//        driveMotorsRobotDrive = new RobotDrive(1, 2, 3, 4);
//        
//        driveMotorsRobotDrive.setSafetyEnabled(true);
//        driveMotorsRobotDrive.setExpiration(0.1);
//        driveMotorsRobotDrive.setSensitivity(0.5); 
//        driveMotorsRobotDrive.setMaxOutput(1.0);


    }
}

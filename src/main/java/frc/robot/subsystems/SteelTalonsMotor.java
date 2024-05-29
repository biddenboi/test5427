package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;

public class SteelTalonsMotor extends SubsystemBase {
    private Spark leftMotor1 = new Spark(0);
    private Spark leftMotor2 = new Spark(1);
    private Spark rightMotor1 = new Spark(2);
    private Spark rightMotor2 = new Spark(3);
    private Joystick joy1 = new Joystick(0);
    private float speed = 0.6f;

    //continually sets and updates the motor movement
    @Override 
    public void periodic() {
        
        //PLACEHOLDER axis value
        double left = joy1.getRawAxis(1) * 0.6;
        double right = joy1.getRawAxis(4) * 0.6;
    
        leftMotor1.set(left);
        leftMotor2.set(left);
        rightMotor1.set(-right); //right opposite chassis
        rightMotor2.set(-right);
    
        //shuffle board log for speed
        SmartDashboard.putNumber("Left Motor Speed", left);
        SmartDashboard.putNumber("Right Motor Speed", right);
    }
    
    public void setSpeed(int s) {
        this.speed = s;
    }
}
package frc.robot;

import java.time.Period;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystems.LedSubsystem;

public class Robot extends TimedRobot {

  private Spark leftMotor1 = new Spark(0);
  private Spark leftMotor2 = new Spark(1);
  private Spark rightMotor1 = new Spark(2);
  private Spark rightMotor2 = new Spark(3);
  LedSubsystem led = new LedSubsystem();
  private Joystick joy1 = new Joystick(0);

  @Override
  public void robotInit() {
    //PLACEHOLDER led length
    
  }

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {
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
    led.periodic();
  }

  @Override
  public void disabledInit() {}

  @Override 
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}

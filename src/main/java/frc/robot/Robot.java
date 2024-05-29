package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import frc.robot.subsystems.LedSubsystem;
import frc.robot.subsystems.SteelTalonsMotor;

public class Robot extends TimedRobot {
LedSubsystem led = new LedSubsystem();
SteelTalonsMotor motor = new SteelTalonsMotor();
double startTime;

  @Override
  public void robotInit() {
    //PLACEHOLDER led length
    
  }


  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {
    startTime = Timer.getFPGATimestamp();
  }

  @Override
  public void autonomousPeriodic() {
    double time = Timer.getFPGATimestamp();
    if (time - startTime < 3) {
      motor.setSpeed(.6f);
    }else {
      motor.setSpeed(0);
    }
  }

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {
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

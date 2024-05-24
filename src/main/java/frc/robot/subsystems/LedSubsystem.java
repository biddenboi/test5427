package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LedSubsystem  extends SubsystemBase{
    //PLACEHOLDER pwm port
    AddressableLED led;
    AddressableLEDBuffer ledBuffer;
    
    public LedSubsystem() {
        led = new AddressableLED(9);

        //don't quite understand the point of a buffer
        ledBuffer = new AddressableLEDBuffer(60);
        led.setLength(ledBuffer.getLength());

        led.setData(ledBuffer);
        led.start();
    }

    @Override
    public void periodic() {
        setAllColor(0, 0, 0);
    }
    public void setAllColor(int r, int g, int b) {
        for (int i = 0; i < ledBuffer.getLength(); i++) {
            ledBuffer.setRGB(i, r, g, b);
        }
    }
    public void setColor(int led, int r, int g, int b) {
        ledBuffer.setRGB(led, r, g, b);
    }
}
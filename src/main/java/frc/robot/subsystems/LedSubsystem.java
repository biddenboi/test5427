package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import java.awt.Color;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LedSubsystem  extends SubsystemBase{
    //PLACEHOLDER pwm port
    AddressableLED led;
    AddressableLEDBuffer ledBuffer;
    Color[] ledColors;
    
    public LedSubsystem() {
        led = new AddressableLED(9);

        //don't quite understand the point of a buffer
        ledBuffer = new AddressableLEDBuffer(60);
        led.setLength(ledBuffer.getLength());

        led.setData(ledBuffer);
        led.start();
        ledColors = new Color[ledBuffer.getLength()];
        setAllColor(0,0,0);
        
    }

    @Override
    public void periodic() {
        for (int i = 0; i < ledColors.length; i++) {
            Color c = ledColors[i];
            ledBuffer.setRGB(i, c.getRed(), c.getGreen(), c.getBlue());
        }
    }
    public void setAllColor(int r, int g, int b) {
        for (int i = 0; i < ledColors.length; i++) {
            setColor(i, r, g, b);
        }
    }
    public void setColor(int led, int r, int g, int b) {
        ledColors[led]= new Color(r,g,b);
    }
}
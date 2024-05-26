package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LedSubsystem  extends SubsystemBase{
    //PLACEHOLDER pwm port
    AddressableLED led;
    AddressableLEDBuffer ledBuffer;
    SteelTalonsColor[] ledColors;
    
    public LedSubsystem() {
        led = new AddressableLED(9);

        //don't quite understand the point of a buffer
        ledBuffer = new AddressableLEDBuffer(60);
        led.setLength(ledBuffer.getLength());

        led.setData(ledBuffer);
        led.start();
        ledColors = new SteelTalonsColor[ledBuffer.getLength()];
        setAllColor(0,0,0);
        
    }

    @Override
    public void periodic() {
        for (int i = 0; i < ledColors.length; i++) {
            SteelTalonsColor c = ledColors[i];
            ledBuffer.setRGB(i, c.getRed(), c.getGreen(), c.getBlue());
        }
    }
    public void setAllColor(int r, int g, int b) {
        for (int i = 0; i < ledColors.length; i++) {
            setColor(i, r, g, b);
        }
    }
    public void setColor(int led, int r, int g, int b) {
        if (ledColors[led] == null) {
            ledColors[led] = new SteelTalonsColor(r,g,b);
            return;
        }
        ledColors[led].setRed(r);
        ledColors[led].setGreen(g);
        ledColors[led].setBlue(b);
    }

    public void setLength(int length) {
        ledBuffer = new AddressableLEDBuffer(length);
    }

    public int getLength() {
        return ledBuffer.getLength();
    }
}
package frc.robot.subsystems;

/**color class defined for use of LedSubsystems, created due to lack of ability to modify
rgb values after initialization for existing libraries (import java.awt.Color;)*/
public class SteelTalonsColor {
    private int red;
    private int blue;
    private int green;
    
    public SteelTalonsColor() {
        red = green = blue = 0;
    }
    public SteelTalonsColor(int r, int g, int b) {
        red = r;
        green = g;
        blue = b;
    }

    public void setRed(int r) {
        red = r%255;
    }
    public void setGreen(int g) {
        green = g%255;
    }
    public void setBlue(int b) {
        blue = b%255;
    }

    public int getRed() {
        return red;
    }
    public int getGreen() {
        return green;
    }
    public int getBlue() {
        return blue;
    }
}
 
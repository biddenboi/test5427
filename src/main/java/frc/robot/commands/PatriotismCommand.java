package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.LedSubsystem;

public class PatriotismCommand extends Command {
    private final LedSubsystem ledSubsystem;

    public PatriotismCommand(LedSubsystem ledSubsystem) {
        this.ledSubsystem = ledSubsystem;
        addRequirements(ledSubsystem); //what is the point?
    }

    @Override
    public void initialize() {
        for (int i = 0; i < ledSubsystem.getLength(); i+=3) {
            ledSubsystem.setColor(i, 255, 0, 0);
        }
        for (int i = 1; i < ledSubsystem.getLength(); i+=3) {
            ledSubsystem.setColor(i, 0, 0, 0);
        }
        for (int i = 2; i < ledSubsystem.getLength(); i+=3) {
            ledSubsystem.setColor(i, 0, 0, 255);
        }
    }

    @Override
    public void execute() {

    }


    @Override 
    public boolean isFinished() {
        return true;//immediately completes;
    }
    
}

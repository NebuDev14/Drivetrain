package frc.robot.commands;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.PortMap;
import frc.robot.Robot;

public class DriveCommand extends InstantCommand {
    private DigitalInput limitSwitch = new DigitalInput(PortMap.TOP_LIMIT_SWITCH);

    public void execute() {
        Robot.driveSubsystem.moveRobot(limitSwitch.get() ? 0 : Robot.oi.leftJoystick.getY(),
                limitSwitch.get() ? 0 : Robot.oi.rightJoystick.getY());
    }

}

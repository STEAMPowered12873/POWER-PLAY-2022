package org.firstinspires.ftc.teamcode.TeleOps;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Subsystems.Drivetrain;

@TeleOp(name="Tank Drive")
public class TankDrive extends OpMode {
    private Drivetrain drivetrain = new Drivetrain();

    @Override
    public void init() {
        drivetrain.init(hardwareMap);

        telemetry.addData(">", "Robot Initialized");
        telemetry.update();
    }

    @Override
    public void loop() {
        drivetrain.tankDrive(gamepad1.left_stick_y, gamepad1.right_stick_y);
    }
}

package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

public class Drivetrain {
    public DcMotor FR, FL, BR, BL;
    ElapsedTime time = new ElapsedTime();

    public Drivetrain(){}

    public void init(HardwareMap hw){
        FR = hw.get(DcMotor.class, "FR");
        FL = hw.get(DcMotor.class, "FL");
        BR = hw.get(DcMotor.class, "BR");
        BL = hw.get(DcMotor.class, "BL");

//        FR.setDirection(DcMotor.Direction.REVERSE);
//        FL.setDirection(DcMotor.Direction.FORWARD);
//        BR.setDirection(DcMotor.Direction.FORWARD);
//        BL.setDirection(DcMotor.Direction.REVERSE);
    }

    public void setMode(DcMotor.RunMode mode){
        FR.setMode(mode);
        FL.setMode(mode);
        BR.setMode(mode);
        BL.setMode(mode);
    }

    public void setPower(double power){
        FR.setPower(power);
        FL.setPower(power);
        BR.setPower(power);
        BL.setPower(power);
    }

    public void tankDrive(double leftPower, double rightPower){
        FR.setPower(rightPower);
        FL.setPower(leftPower);
        BR.setPower(rightPower);
        BL.setPower(leftPower);
    }

    public void mecanumDrive(double forwardPower, double lateralPower, double rotationalPower){
        FR.setPower(Range.clip((forwardPower - lateralPower - rotationalPower), -1, 1));
        FL.setPower(Range.clip((forwardPower - lateralPower + rotationalPower), -1, 1));
        BR.setPower(Range.clip((forwardPower + lateralPower - rotationalPower), -1, 1));
        BL.setPower(Range.clip((forwardPower + lateralPower + rotationalPower), -1, 1));
    }
}

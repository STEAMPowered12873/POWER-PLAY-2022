package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

public class Drivetrain {
    private DcMotor FL, FR, BL, BR;

    public Drivetrain(){}

    public void init(HardwareMap hw){
        FL = hw.get(DcMotor.class, "FL");
        FR = hw.get(DcMotor.class, "FR");
        BL = hw.get(DcMotor.class, "BL");
        BR = hw.get(DcMotor.class, "BR");

//        FL.setDirection(DcMotor.Direction.REVERSE);
//        BL.setDirection(DcMotor.Direction.REVERSE);
    }
    public void setMode(DcMotor.RunMode mode){
        FL.setMode(mode);
        FR.setMode(mode);
        BL.setMode(mode);
        BR.setMode(mode);
    }

    public void setPower(double power){
        FL.setPower(power);
        FR.setPower(power);
        BL.setPower(power);
        BR.setPower(power);
    }

    public void setPowers(double FLPower, double FRPower, double BLPower, double BRPower){
        FL.setPower(FLPower);
        FR.setPower(FRPower);
        BL.setPower(BLPower);
        BR.setPower(BRPower);
    }

    public void tankDrive(double leftPower, double rightPower){
        FL.setPower(leftPower);
        FR.setPower(rightPower);
        BL.setPower(leftPower);
        BR.setPower(rightPower);
    }

    public void mecanumDrive(double forwardPower, double lateralPower, double rotationalPower){
        FL.setPower(Range.clip((forwardPower - lateralPower + rotationalPower), -1, 1));
        FR.setPower(Range.clip((forwardPower + lateralPower - rotationalPower), -1, 1));
        BL.setPower(Range.clip((forwardPower + lateralPower + rotationalPower), -1, 1));
        BR.setPower(Range.clip((forwardPower - lateralPower - rotationalPower), -1, 1));
    }
}



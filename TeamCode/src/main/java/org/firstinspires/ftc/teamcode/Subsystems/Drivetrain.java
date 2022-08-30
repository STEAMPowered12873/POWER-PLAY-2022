package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

public class Drivetrain {
    public DcMotor FR, FL, BR, BL;
    ElapsedTime time = new ElapsedTime();

    public double targetHeading = 0;
    private double pTime;


    public Drivetrain(){}

    public void initMecanum(HardwareMap hw){
        FR = hw.get(DcMotor.class, "FR");
        FL = hw.get(DcMotor.class, "FL");
        BR = hw.get(DcMotor.class, "BR");
        BL = hw.get(DcMotor.class, "BL");

//        FR.setDirection(DcMotor.Direction.REVERSE);
//        FL.setDirection(DcMotor.Direction.FORWARD);
//        BR.setDirection(DcMotor.Direction.FORWARD);
//        BL.setDirection(DcMotor.Direction.REVERSE);
    }
}

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class LinearOpModeTemplate extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {

        while (!opModeIsActive() && !isStopRequested()) {

        }

        waitForStart();

        while (opModeIsActive() && !isStopRequested()) {

        }

    }
}

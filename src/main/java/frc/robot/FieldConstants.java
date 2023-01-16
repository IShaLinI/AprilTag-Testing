// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import java.util.ArrayList;

import edu.wpi.first.apriltag.AprilTag;
import edu.wpi.first.math.geometry.Pose3d;
import edu.wpi.first.math.geometry.Rotation3d;
import edu.wpi.first.math.util.Units;

public class FieldConstants {

    public final static AprilTag tag1 = new AprilTag(1, 
        new Pose3d(
            Units.inchesToMeters(91),
            Units.inchesToMeters(0),
            Units.inchesToMeters(60),
            new Rotation3d(0,0, Math.PI/2)
        )
    );

    public final static AprilTag tag2 = new AprilTag(2, 
        new Pose3d(
            Units.inchesToMeters(154),
            Units.inchesToMeters(0),
            Units.inchesToMeters(74),
            new Rotation3d(0,0, Math.PI/2)
        )
    );

    public final static AprilTag tag3 = new AprilTag(3, 
        new Pose3d(
            Units.inchesToMeters(126),
            Units.inchesToMeters(0),
            Units.inchesToMeters(60),
            new Rotation3d(0,0, Math.PI/2)
        )
    );

    public final static AprilTag tag4 = new AprilTag(4, 
        new Pose3d(
            Units.inchesToMeters(166),
            Units.inchesToMeters(73),
            Units.inchesToMeters(76),
            new Rotation3d(0,0, Math.PI)
        )
    );

    public final static AprilTag tag5 = new AprilTag(5, 
        new Pose3d(
            Units.inchesToMeters(0),
            Units.inchesToMeters(125.75),
            Units.inchesToMeters(64.5),
            new Rotation3d(0,0,0)
        )
    );

    public final static AprilTag tag6 = new AprilTag(6, 
        new Pose3d(
            Units.inchesToMeters(42),
            Units.inchesToMeters(0),
            Units.inchesToMeters(61),
            new Rotation3d(0,0, Math.PI/2)
        )
    );

    public final static AprilTag tag7 = new AprilTag(7, 
        new Pose3d(
            Units.inchesToMeters(0),
            Units.inchesToMeters(42.125),
            Units.inchesToMeters(60.4),
            new Rotation3d(0,0,0)
        )
    );

    public final static AprilTag tag8 = new AprilTag(8, 
        new Pose3d(
            Units.inchesToMeters(87),
            Units.inchesToMeters(132),
            Units.inchesToMeters(66),
            new Rotation3d(0,0, -Math.PI/2)
        )
    );

    public static ArrayList<AprilTag> aprilTagList = new ArrayList<AprilTag>(){
        {
            add(tag1);
            add(tag2);
            add(tag3);
            add(tag4);
            add(tag5);
            add(tag6);
            add(tag7);
            add(tag8);
        }
    };



}

package frc.robot.subsystems;


import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shootersubsystem extends SubsystemBase {

private final SparkMax motor;

public Shootersubsystem(){
motor = new SparkMax(5, MotorType.kBrushless);

}
public void run() {
    motor.set(0.3);
}
public void stop(){
    motor.set(0.0);





}


}
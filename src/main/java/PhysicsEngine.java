import java.io.File;

/**
 * Created by Ankit on 1/17/2017.
 */
public class PhysicsEngine {
    private Motors motors;
    private Gyroscope gyroscope;
    private Accelerometer accelerometer;
    private static final float gravity = 9.81f;

    public void initializePhysics() {
        motors = new Motors();
        gyroscope = new Gyroscope();
        accelerometer = new Accelerometer();
    }
    public void updateValues() {
        motors.updateValues();
        gyroscope.updateValues();
        accelerometer.updateValues();
    }

    public void updatePhysics() {
        updateLinearAcceleration();
    }

    public void updateLinearAcceleration() {
//        accelerometer.setY(); //TODO
        accelerometer.writeComms();
    }
}

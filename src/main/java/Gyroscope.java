/**
 * Created by Ankit on 1/17/2017.
 */
public class Gyroscope {
    private float pitch;
    private float roll;
    private float yaw;
    public Gyroscope(float pitch, float roll, float yaw) {
        this.pitch = pitch;
        this.roll = roll;
        this.yaw = yaw;
    }

    public Gyroscope updateGyro(String inputFile) {
        String[] gyroscope = inputFile.split(",");
        this.pitch = Float.valueOf(gyroscope[0]);
        this.roll = Float.valueOf(gyroscope[1]);
        this.yaw = Float.valueOf(gyroscope[2]);
        return this;
    }
}

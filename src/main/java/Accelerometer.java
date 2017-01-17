/**
 * Created by Ankit on 1/17/2017.
 */
public class Accelerometer {
    private float x;
    private float y;
    private float z;
    public Accelerometer(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Accelerometer updateMotors(String inputFile) {
        String[] acceleromotor = inputFile.split(",");
        this.x = Float.valueOf(acceleromotor[0]);
        this.y = Float.valueOf(acceleromotor[1]);
        this.z = Float.valueOf(acceleromotor[2]);
        return this;
    }

}

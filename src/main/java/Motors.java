/**
 * Created by Ankit on 1/17/2017.
 */
public class Motors {
    private float motor0;
    private float motor1;
    private float motor2;
    private float motor3;
    public Motors(float motor0, float motor1, float motor2, float motor3) {
        this.motor0 = motor0;
        this.motor1 = motor1;
        this.motor2 = motor2;
        this.motor3 = motor3;
    }

    public Motors updateMotors(String inputFile) {
        String[] motorStrings = inputFile.split(",");
        this.motor0 = Float.valueOf(motorStrings[0]);
        this.motor1 = Float.valueOf(motorStrings[1]);
        this.motor2 = Float.valueOf(motorStrings[2]);
        this.motor3 = Float.valueOf(motorStrings[3]);
        return this;
    }
}
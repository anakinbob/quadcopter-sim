import java.io.File;

/**
 * Created by Ankit on 1/17/2017.
 */
public class Motors {
    private float motor0;
    private float motor1;
    private float motor2;
    private float motor3;

    private static final File motors_log = new File("C:/Workspace/quadcopter-sim/logging/motors.txt");
    private static final File motors_comms = new File("C:/Workspace/quadcopter-sim/comms/motors.txt");

    public Motors(float motor0, float motor1, float motor2, float motor3) {
        this.motor0 = motor0;
        this.motor1 = motor1;
        this.motor2 = motor2;
        this.motor3 = motor3;
    }

    public Motors() {
        this(0,0,0,0);
        this.updateValues();
    }

    public Motors updateValues() {
        String inputFile = FileIO.readFile(motors_comms);
        String[] motorStrings = inputFile.split(",");
        this.motor0 = Float.valueOf(motorStrings[0]);
        this.motor1 = Float.valueOf(motorStrings[1]);
        this.motor2 = Float.valueOf(motorStrings[2]);
        this.motor3 = Float.valueOf(motorStrings[3]);
        return this;
    }

    public float calculateThrust() {
        return motor0 + motor1 + motor2 + motor3;
    }

    private void write(File file) {
        String out = this.motor0 + "," + this.motor1 + "," + this.motor2 + "," + this.motor3;
        FileIO.writeFile(file,out);
    }

    public void writeComms() {
        write(motors_comms);
    }

    public void writeLogs() {
        write(motors_log);
    }
}
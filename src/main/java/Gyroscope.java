import java.io.File;

/**
 * Created by Ankit on 1/17/2017.
 */
public class Gyroscope {
    float pitch;
    private float roll;
    private float yaw;
    private static final File gyro_comms = new File("C:/Workspace/quadcopter-sim/comms/gyro.txt");
    private static final File gyro_log = new File("C:/Workspace/quadcopter-sim/logging/gyro.txt");
    public Gyroscope(float pitch, float roll, float yaw) {
        this.pitch = pitch;
        this.roll = roll;
        this.yaw = yaw;
    }

    public Gyroscope() {
        this(0,0,0);
        this.updateValues();
    }

    public Gyroscope updateValues() {
        String inputFile = FileIO.readFile(gyro_comms);
        String[] gyroscope = inputFile.split(",");
        this.pitch = Float.valueOf(gyroscope[0]);
        this.roll = Float.valueOf(gyroscope[1]);
        this.yaw = Float.valueOf(gyroscope[2]);
        return this;
    }

    private void write(File file) {
        String out = this.pitch + "," + this.roll + "," + this.yaw;
        FileIO.writeFile(file,out);
    }

    public void writeComms() {
        write(gyro_comms);
    }

    public void writeLogs() {
        write(gyro_log);
    }
}

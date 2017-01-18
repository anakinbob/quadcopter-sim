import java.io.File;

/**
 * Created by Ankit on 1/17/2017.
 */
public class Accelerometer {
    private float x;
    private float y;
    private float z;
    public static final File accel_comms = new File("C:/Workspace/quadcopter-sim/comms/accel.txt");
    public static final File accel_log = new File("C:/Workspace/quadcopter-sim/logging/accel.txt");
    public Accelerometer(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Accelerometer() {
        this(0,0,0);
        this.updateValues();
    }

    public void setY(float y) {this.y = y;}

    public Accelerometer updateValues() {
        String inputFile = FileIO.readFile(accel_comms);
        String[] accelerometer = inputFile.split(",");
        this.x = Float.valueOf(accelerometer[0]);
        this.y = Float.valueOf(accelerometer[1]);
        this.z = Float.valueOf(accelerometer[2]);
        return this;
    }

    private void write(File file) {
        String out = this.x + "," + this.y + "," + this.z;
        FileIO.writeFile(file,out);
    }

    public void writeComms() {
        write(accel_comms);
    }

    public void writeLogs() {
        write(accel_log);
    }
}

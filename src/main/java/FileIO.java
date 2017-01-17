import java.io.*;

/**
 * Created by Ankit on 1/17/2017.
 */
public class FileIO {
    public static String readFile(File inputPath) {
        String output = "";
        try(BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(inputPath)))) {
            output = input.readLine();
        } catch( IOException e) {
            e.printStackTrace();
        }
        return output;
    }

    public static void appendFile(File outputPath, String toWrite) {
        try(BufferedWriter output = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputPath)))) {
            output.append(toWrite);
        } catch( IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(File outputPath, String toWrite) {
        try(BufferedWriter output = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputPath)))) {
            output.write(toWrite);
        } catch( IOException e) {
            e.printStackTrace();
        }
    }

    public static String consoleRead() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}

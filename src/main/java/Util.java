import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;

public class Util {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private Util() {
    }

    public static String readString() throws IOException {
        return reader.readLine();
    }

    public static int readInt() throws IOException {
        return Integer.parseInt(readString().trim());
    }

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static Path buildFileName(String path, String suffix) {
        String pathName = path.substring(0, path.lastIndexOf("."));
        String expansion = path.substring(path.lastIndexOf("."));
        return Path.of(pathName + suffix + expansion);
    }
}

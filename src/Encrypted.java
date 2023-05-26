import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Encrypted {

    private final CesarCipher cesarCipher = new CesarCipher();
    private final BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

    public void encrypted1() throws IOException {

        System.out.println("Введите адрес файла с текстом для шифрования");
        String path = console.readLine();

        System.out.println("Введите ключ для шифрования в формате целого числа");
        int key = Integer.parseInt(console.readLine());

        System.out.println("Введите адрес файла для записи результата шифрования");
        String newPath = console.readLine();

        try (BufferedReader reader = Files.newBufferedReader(Path.of(path));
             BufferedWriter writer = Files.newBufferedWriter(Path.of(newPath))) {
            while (console.ready()) {
                String line = reader.readLine();
                String encrypt = cesarCipher.encrypt(line, key);
                writer.write(encrypt + System.lineSeparator());
            }
        }
        System.out.println("Содержимое файла зашифрованно" + System.lineSeparator());
    }

    public void encrypted() throws IOException {

        System.out.println("Введите адрес файла с текстом для шифрования");
        String path = console.readLine();

        System.out.println("Введите ключ для шифрования в формате целого числа");
        int key = Integer.parseInt(console.readLine());

        System.out.println("Введите адрес файла для записи результата шифрования");
        String newPath = console.readLine();

        String content = Files.readString(Path.of(path));//сделать через тернарник
        String encrypt = cesarCipher.encrypt(content, key);////сделать через тернарник
        Files.writeString(Path.of(newPath), encrypt);// //сделать через тернарник
        System.out.println("Содержимое файла зашифрованно" + System.lineSeparator());
    }
}
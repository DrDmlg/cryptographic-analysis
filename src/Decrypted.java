import java.io.*;

public class Decrypted {


    public static CesarCipher cesarCipher = new CesarCipher();

    public static void main(String[] args) {

    }

    public void decrypted() throws IOException {

        System.out.println("Введите адрес файла с текстом для расшифрования");
        String src = null;
        int key = 0;
        String dest = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        src = reader.readLine();

        System.out.println("Введите ключ для расшифрования в формате целого числа");
        key = Integer.parseInt(reader.readLine());

        System.out.println("Введите адрес файла для записи результата расшифрования");
        dest = reader.readLine();


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(src));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dest))) {
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                String end = cesarCipher.decrypt(line, key);
                bufferedWriter.write(end + System.lineSeparator());
            }
        }
    }
}




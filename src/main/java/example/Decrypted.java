/*
package example;


import java.io.*;

public class Decrypted {


    public static CesarCipher cesarCipher = new CesarCipher();

    public static void main(String[] args) {

    }

    public String decrypted(String path, String dest, int key) throws IOException {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dest))) {
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                String end = cesarCipher.decrypt(line, key);
                bufferedWriter.write(end + System.lineSeparator());
            }
            return "Содержимое файла зашифрованно" + System.lineSeparator();
        }
    }
}

        /*System.out.println("Введите адрес файла с текстом для расшифрования");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();

        System.out.println("Введите ключ для расшифрования в формате целого числа");
        int key = Integer.parseInt(reader.readLine());

        System.out.println("Введите адрес файла для записи результата расшифрования");
        String dest = reader.readLine();


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dest))) {
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                String end = cesarCipher.decrypt(line, key);
                bufferedWriter.write(end + System.lineSeparator());
            }
        }

         */




